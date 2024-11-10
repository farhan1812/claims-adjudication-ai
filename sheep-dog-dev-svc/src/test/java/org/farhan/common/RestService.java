package org.farhan.common;

import java.io.File;
import java.util.TreeMap;

import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.service.ModelTransformerResponse;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class RestService extends TestObject {

	@Value("${server.port}")
	private int port;

	private String getHost() {
		return "http://localhost:" + port + "/";
	}

	private final RestTemplate restTemplate = new RestTemplate();

	private void addFile(String tags, String fileName, String contents) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("fileName", fileName);
		restTemplate.postForObject(getHost() + "addFile?tags={tags}&fileName={fileName}", contents,
				ModelTransformerResponse.class, parameters);
	}

	private void runGoal(String tags, String goal) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		restTemplate.postForObject(getHost() + goal + "?tags={tags}", null, ModelTransformerResponse.class, parameters);
	}

	private String getFileList(String tags) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		return restTemplate
				.getForObject(getHost() + "getFileList?tags={tags}", ModelTransformerResponse.class, parameters)
				.fileName();
	}

	private String getFileContents(String tags, String fileName) {
		TreeMap<String, String> parameters = new TreeMap<String, String>();
		parameters.put("tags", tags);
		parameters.put("fileName", fileName);
		return restTemplate.getForObject(getHost() + "getFileContents?tags={tags}&fileName={fileName}",
				ModelTransformerResponse.class, parameters).content();
	}

	protected void runGoal(String resource) {
		try {
			File srcDir = new File("target/src-gen/" + this.keyValue.get("component") + "/src/test/");
			if (keyValue.get("tags") == null) {
				keyValue.put("tags", "");
			}

			for (File aFile : Utilities.recursivelyListFiles(srcDir, "")) {
				String contents = Utilities.readFile(aFile);
				String fileName = aFile.getAbsolutePath().replace(srcDir.getAbsolutePath() + "\\", "");
				addFile(keyValue.get("tags"), fileName.replace("\\", "/"), contents);
			}

			runGoal(keyValue.get("tags"), resource);

			for (String fileName : getFileList(keyValue.get("tags")).split("\n")) {
				String contents = getFileContents(keyValue.get("tags"), fileName.replace("\\", "/"));
				Utilities.writeFile(new File(srcDir.getAbsolutePath() + "\\" + fileName), contents);
			}
		} catch (Exception e) {
			Assertions.fail(Utilities.getStackTraceAsString(e));
		}
	}
}
