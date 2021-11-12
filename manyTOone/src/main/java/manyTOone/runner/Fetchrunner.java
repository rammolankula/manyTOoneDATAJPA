package manyTOone.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import manyTOone.domain.Employee;
import manyTOone.repository.Emprepository;

public class Fetchrunner implements CommandLineRunner {

	@Autowired
	Emprepository erepo;
	
	@Override
	public void run(String... args) throws Exception {
		Optional<Employee> opt=erepo.findById(11);
		System.out.println("Ok");
		

	}

}
