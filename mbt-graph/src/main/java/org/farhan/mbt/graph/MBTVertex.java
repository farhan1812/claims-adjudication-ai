package org.farhan.mbt.graph;

import java.util.HashMap;

public class MBTVertex {

	private HashMap<String, Object> attributes;

	public MBTVertex(String label) {
		attributes = new HashMap<String, Object>();
		attributes.put("label", label);
	}

	public String getLabel() {
		return (String) attributes.get("label");
	}

	public void addAttribute(String key, Object value) {
		// the prefix is there to prevent an attribute matching tag or label
		attributes.put("_" + key, value);
	}

	public String getAttribute(String key) {
		return attributes.get("_" + key).toString();
	}

	@Override
	public String toString() {
		return getLabel();
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object o) {
		return toString().equals(o.toString());
	}
}
