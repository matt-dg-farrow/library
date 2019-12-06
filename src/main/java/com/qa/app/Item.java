package com.qa.app;

public abstract class Item {

	public static int id;
	public String name;
	public boolean availability = true;

	public boolean checkOut() {
		if (availability) {
			availability = false;
		}
		return availability;
	}

	public boolean checkIn() {
		if (!availability) {
			availability = true;
		}
		return availability;
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

	public void updateAll(String name, int id) {
		this.name = name;
		this.id = id;
	}

}
