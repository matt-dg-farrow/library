package com.qa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.qa.app.Book;
import com.qa.app.Camera;
import com.qa.app.Library;
import com.qa.app.Map;
import com.qa.main.Person;

public class testLibrary {

	@Test
	public void libraryTest() {
		Book book1 = new Book();
		Book book2 = new Book();
		Map map1 = new Map();
		Map map2 = new Map();
		Map map3 = new Map();
		Camera cam1 = new Camera();
		Camera cam4 = new Camera();
		Camera cam3 = new Camera();
		Camera cam2 = new Camera();

		book1.setName("The book");
		map1.setName("The map");
		cam1.setName("The camera");
		assertEquals("The book", book1.getName());

		book1.updateAll("THE BOOK!", 101);

		assertEquals("THE BOOK!", book1.getName());
		assertEquals("The map", map1.getName());
		assertEquals("The camera", cam1.getName());

		assertTrue(!book1.checkOut());
		assertTrue(book1.checkIn());

		System.out.println(book1 instanceof Book);

		assertEquals("This book is readable.", book1.readable());

		Library lib1 = new Library();
		lib1.addItem(book1);

		assertTrue(lib1.library1.contains(book1));
		book1.checkIn();
		System.out.println(lib1.isAvailable(book1));
		assertEquals("THE BOOK! is available.", lib1.isAvailable(book1));

		lib1.removeItem(book1);

		assertTrue(lib1.library1.isEmpty());

		lib1.addItem(cam1);
		lib1.addItem(map1);
		lib1.addItem(book1);
		lib1.addItem(book2);
		lib1.addItem(map2);
		lib1.addItem(map3);
		lib1.addItem(cam2);
		lib1.addItem(cam3);
		lib1.addItem(cam4);

		assertEquals(2, lib1.stockOfBook());
		assertEquals(3, lib1.stockOfMap());
		assertEquals(4, lib1.stockOfCamera());

		assertEquals(book1, lib1.getItem(book1));

		Person person1 = new Person();
		person1.updateName("Jim");
		person1.updateAge(22);
		person1.updateId(578);

		assertEquals("Jim", person1.getName());
		assertEquals(22, person1.getAge());
		assertEquals(578, person1.getId());

		person1.updateAll("Bob", 66, 990);

		assertEquals("Bob", person1.getName());
		assertEquals(66, person1.getAge());
		assertEquals(990, person1.getId());

		lib1.registerPerson(person1);

		assertEquals(person1, lib1.getPerson(person1));

		lib1.removePerson(person1);

		assertEquals(null, lib1.getPerson(person1));

	}

}
