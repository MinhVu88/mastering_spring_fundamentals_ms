package com.udemy.matt_speake.spring_fundamentals.sec_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MyService implements EnvironmentAware {
	// @Value("${client.name:John Doe}")
	// private String client;

	@Value("${service.baseUrl}")
	private String SERVICE_BASEURL;

	private Environment environment;

	private MyRepository myRepository;

	@Autowired
	public MyService(MyRepository myRepository) {
		this.myRepository = myRepository;
	}

	public void setMyRepository(MyRepository myRepo) {
		this.myRepository = myRepo;
	}

	/*
	public void setClient(String client) {
		this.client = client;
	}
	*/

	public void handleBusinessLogic() {
		// System.out.println("\thandle business logic for " + client);
		System.out.println(
			"\thandle business logic | Active profiles -> " +
			Arrays.toString(this.environment.getActiveProfiles()) +
			String.format(" | Connecting to %s", SERVICE_BASEURL)
		);

		myRepository.query();
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}
}
