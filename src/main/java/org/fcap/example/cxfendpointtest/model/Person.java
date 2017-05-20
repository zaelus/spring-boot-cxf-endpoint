package org.fcap.example.cxfendpointtest.model;

import java.io.Serializable;

/**
 * Created by Zaphire on 20/05/2017.
 */
public class Person implements Serializable{

	private static final long serialVersionUID = -5196027651424167821L;

	private String name;
	private String surname;
	private Address address;

	public Person() {
	}

	public Person(String name, String surname, Address address) {
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", address=" + address +
				'}';
	}
}
