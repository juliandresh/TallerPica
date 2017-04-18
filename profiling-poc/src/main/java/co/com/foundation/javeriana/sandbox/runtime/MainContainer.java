package co.com.foundation.javeriana.sandbox.runtime;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.DependsOn;

import co.com.foundation.javeriana.sandbox.service.DBService;
import co.com.foundation.javeriana.sandbox.service.FlightsService;
import co.com.foundation.javeriana.sandbox.service.WorkflowService;

@SpringBootApplication
@ComponentScan(basePackages="co.com.foundation.javeriana.sandbox")
public class MainContainer {

	@Autowired
	private FlightsService flightsService;
	@Autowired
	private WorkflowService workflowService;
	@Autowired
	private DBService dbService;
	
	@Bean(destroyMethod = "shutdown")
	public SpringBus cxf() {
		return new SpringBus();
	}

	@Bean(destroyMethod = "destroy")
	@DependsOn("cxf")
	public Server jaxRsServer() {
		
		JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
		factory.setServiceBeanObjects(workflowService,flightsService,dbService);
		factory.setBus(cxf());
		factory.setAddress("/");

		return factory.create();
	}

	@Bean
	public ServletRegistrationBean cxfServlet() {
		final ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new CXFServlet(), "/api/*");
		servletRegistrationBean.setLoadOnStartup(1);
		return servletRegistrationBean;
	}

	public static void main(String[] args) { 
		SpringApplication.run(MainContainer.class, args);
	}

}
