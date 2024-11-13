package org.farhan.runners.surefire;

import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;

import java.io.File;

import org.farhan.mbt.core.Utilities;
import org.farhan.mbt.service.RestServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.farhan")
@EnableAutoConfiguration
@ActiveProfiles("surefire")
@CucumberContextConfiguration
@SpringBootTest(classes = RestServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberSpringConfiguration {

	@Before
	public void before() {
		Utilities.deleteDir(new File("target/src-gen/"), "");
		// TODO temp hack until properties are passed in
		Utilities.deleteDir(new File("/null"), "");
	}

}