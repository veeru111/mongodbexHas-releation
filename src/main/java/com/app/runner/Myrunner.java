package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Address;
import com.app.model.Employee;
import com.app.repo.Mongorep;

@Component
public class Myrunner implements CommandLineRunner {

	@Autowired
	private Mongorep repo;
	
	@Override
	public void run(String... args) throws Exception {

		repo.deleteAll();
		repo.save(new Employee("karvy", new Address("hyder","53.52")));
		System.err.println("finished");
		
	}

}
