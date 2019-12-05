package com.qa.app;

public class Book extends Item implements Readable {

	public String readable() {
		return "This book is readable.";
	}

}
