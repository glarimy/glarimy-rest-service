package com.glarimy.add;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Employee implements Serializable {
	private String eid;
	private String name;

	public Employee() {

	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

}
