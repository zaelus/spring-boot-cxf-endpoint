package org.fcap.example.cxfendpointtest.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.fcap.example.cxfendpointtest.CxfEndpointTestApplication;
import org.fcap.example.cxfendpointtest.IHelloWorldPortType;
import org.fcap.example.cxfendpointtest.impl.HelloWorldWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.xml.ws.Endpoint;

/**
 * Created by Zaphire on 20/05/2017.
 */
@Configuration
@Import(CxfEndpointTestApplication.class)
public class EndpointConfig {

	@Autowired
	private Bus bus;

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus,
				getHelloWorldWSInstance());
		endpoint.publish("/helloworld");
		return endpoint;
	}

	@Bean
	public IHelloWorldPortType getHelloWorldWSInstance(){
		return new HelloWorldWebService();
	}
}