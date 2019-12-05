package com.qa.main;

public class Person {

	private String name;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void updateName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void updateAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void updateId(int id) {
		this.id = id;
	}

	public void updateAll(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

}
