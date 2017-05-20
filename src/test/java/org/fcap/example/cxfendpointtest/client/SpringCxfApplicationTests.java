package org.fcap.example.cxfendpointtest.client;

import org.fcap.example.cxfendpointtest.model.Address;
import org.fcap.example.cxfendpointtest.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Zaphire on 20/05/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringCxfApplicationTests {

	@Autowired
	private HelloWorldClient helloWorldClient;

	@Test
	public void testSayHello() {

		assertThat(helloWorldClient.sayHello("John"))
				.isEqualTo("Hello John");
	}

	@Test
	public void testSayHelloForPerson() {

		assertThat(helloWorldClient.sayHelloForPerson(new Person("Francesco", "Caporale", new Address("Roma", "Via Roma 12"))))
				.isEqualTo("Hi Francesco Caporale, Roma Via Roma 12");
	}
}