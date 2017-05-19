package org.fcap.example.cxfendpointtest.client;

import org.fcap.example.cxfendpointtest.IHelloWorldPortType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Zaphire on 20/05/2017.
 */
@Component
public class HelloWorldClient {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(HelloWorldClient.class);

	@Autowired
	private IHelloWorldPortType helloWorldClientProxyBean;

	public String sayHello(String firstName) {

		LOGGER.info("Client sending person=[firstName:{}]",
				firstName);

		String greeting = helloWorldClientProxyBean
				.sayHello(firstName);

		LOGGER.info("Client received greeting=[{}]",
				greeting);
		return greeting;
	}
}