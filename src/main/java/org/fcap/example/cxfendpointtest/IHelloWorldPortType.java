package org.fcap.example.cxfendpointtest;

import org.fcap.example.cxfendpointtest.model.Person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Zaphire on 20/05/2017.
 */
@WebService
public interface IHelloWorldPortType {

	@WebMethod
	String sayHello(@WebParam(name = "name") String name);

	String sayHelloForPerson(@WebParam(name = "person") Person person);
}
