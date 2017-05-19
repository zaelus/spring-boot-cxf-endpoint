package org.fcap.example.cxfendpointtest.impl;

import org.fcap.example.cxfendpointtest.IHelloWorldPortType;

/**
 * Created by Zaphire on 20/05/2017.
 */
public class HelloWorldWebService implements IHelloWorldPortType {

	@Override
	public String sayHello(String name) {
		System.out.println("Said hello to ... " + name);

		return "Hello " + name;
	}
}
