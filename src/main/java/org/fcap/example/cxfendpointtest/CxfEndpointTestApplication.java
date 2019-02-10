package org.fcap.example.cxfendpointtest;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.fcap.example.cxfendpointtest.aop.ValidateWSAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CxfEndpointTestApplication {

	public static void main(String[] args) {

//		System.setProperty("server.servlet.context.path", "/bootapp");

		SpringApplication.run(CxfEndpointTestApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean cxfServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/soap-api/*");
	}

	@Bean(name= Bus.DEFAULT_BUS_ID)
	public SpringBus springBus() {
		return new SpringBus();
	}

	@Bean
	public ValidateWSAspect validateWSAspect(){
		return new ValidateWSAspect();
	}

}
