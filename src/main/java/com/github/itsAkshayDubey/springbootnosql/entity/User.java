package com.github.itsAkshayDubey.springbootnosql.entity;

public class User {
	
	private int id;
	private String name;
	private boolean isEnabled;
	
	public User(int id, String name, boolean isEnabled) {
		super();
		this.id = id;
		this.name = name;
		this.isEnabled = isEnabled;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

}
