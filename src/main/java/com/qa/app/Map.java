package com.qa.app;

public class Map extends Item implements Readable {

	public String readable() {
		System.out.println("This map is readable.");
		return "This map is readable.";

	}

}
