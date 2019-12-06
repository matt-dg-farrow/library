package com.qa.app;

import java.util.ArrayList;
import java.util.List;

import com.qa.main.Person;

public class Library {

	public List<Item> library1 = new ArrayList<Item>();
	public List<Person> people1 = new ArrayList<Person>();

	public void addItem(Item item) {

		library1.add(item);

	}

	public void removeItem(Item item) {

		library1.remove(item);

	}

	public Item getItem(Item item) {
		for (int i = 0; i < library1.size(); i++) {
			if (library1.get(i) == item) {
				return library1.get(i);

			}

		}
		return null;
	}

	public Person getPerson(Person person) {
		for (int i = 0; i < people1.size(); i++) {
			if (people1.get(i) == person) {
				return people1.get(i);

			}

		}
		return null;
	}

	public int stockOfBook() {
		int count = 0;
		for (Item i : library1) {
			if (i instanceof Book) {
				count++;
			}

		}
		System.out.println(count);
		return count;
	}

	public int stockOfMap() {
		int count = 0;
		for (Item i : library1) {
			if (i instanceof Map) {
				count++;
			}

		}
		System.out.println(count);
		return count;
	}

	public int stockOfCamera() {
		int count = 0;
		for (Item i : library1) {
			if (i instanceof Camera) {
				count++;
			}

		}
		System.out.println(count);
		return count;
	}

	public String isAvailable(Item item) {
		String message;
		if (item.availability = false) {
			message = item.name + " is unavailable.";
		} else {
			message = item.name + " is available.";
		}
		return message;
	}

	public void registerPerson(Person person) {
		people1.add(person);
	}

	public void removePerson(Person person) {
		people1.remove(person);
	}

}
