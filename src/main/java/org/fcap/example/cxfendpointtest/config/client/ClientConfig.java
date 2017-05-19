package org.fcap.example.cxfendpointtest.config.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.fcap.example.cxfendpointtest.IHelloWorldPortType;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Zaphire on 20/05/2017.
 */
@Configuration
public class ClientConfig {

	@Value("${helloworld.service.address}")
	private String helloworldServiceAddress;

	@Bean(name = "helloWorldClientProxyBean")
	public IHelloWorldPortType opportunityPortType() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(IHelloWorldPortType.class);
		jaxWsProxyFactoryBean.setAddress(helloworldServiceAddress);

		return (IHelloWorldPortType) jaxWsProxyFactoryBean.create();
	}

}