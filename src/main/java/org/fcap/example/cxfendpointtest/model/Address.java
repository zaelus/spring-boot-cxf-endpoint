package org.fcap.example.cxfendpointtest.model;

import java.io.Serializable;

/**
 * Created by Zaphire on 20/05/2017.
 */
public class Address implements Serializable{

	String city;
	String street;

	public Address() {
	}

	public Address(String city, String street) {
		this.city = city;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address{" +
				"city='" + city + '\'' +
				", street='" + street + '\'' +
				'}';
	}
}
