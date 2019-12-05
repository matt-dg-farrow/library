package com.qa.app;

import com.qa.main.Person;

public class Main {
	public static void main(String[] args) {
		Library lib = new Library();
		Book book1 = new Book();
		Book book2 = new Book();
		Map map1 = new Map();
		Camera cam1 = new Camera();
		Camera cam2 = new Camera();

		book1.updateAll("Book 1", 1);
		book2.updateAll("Book 2", 2);
		map1.updateAll("Map 1", 3);
		cam1.updateAll("Cam 1", 4);
		cam2.updateAll("Cam 2", 5);

		lib.addItem(book1);
		lib.addItem(book2);
		lib.addItem(map1);
		lib.addItem(cam1);
		lib.addItem(cam2);

		System.out.println(lib.getItem(book1).getName());

		Person person1 = new Person();
		person1.updateAll("Bill", 88, 6);

		lib.registerPerson(person1);

		System.out.println(lib.getPerson(person1).getName());

	}
}
