package org.fcap.example.cxfendpointtest.impl;

import org.fcap.example.cxfendpointtest.IHelloWorldPortType;
import org.fcap.example.cxfendpointtest.model.Person;
import org.springframework.stereotype.Service;

/**
 * Created by Zaphire on 20/05/2017.
 */
@Service
public class HelloWorldWebService implements IHelloWorldPortType {

	@Override
	public String sayHello(String name) {
		System.out.println("Said hello to ... " + name);

		return "Hello " + name;
	}

	@Override
	public String sayHelloForPerson(Person person) {
		return "Hi " +
				person.getName() + " " +  person.getSurname() + ", " +
				person.getAddress().getCity() + " " + person.getAddress().getStreet();
	}
}
