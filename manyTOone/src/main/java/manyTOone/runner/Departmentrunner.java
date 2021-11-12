package manyTOone.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import manyTOone.domain.Department;
import manyTOone.repository.Deporepository;
@Component
public class Departmentrunner implements CommandLineRunner {

	@Autowired
	Deporepository drepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		drepo.save(new Department(11,"software","dev"));
		drepo.save(new Department(12,"software","testing"));
		drepo.save(new Department(13,"software","analyst"));
		drepo.save(new Department(14,"software","TA"));
		

	}

}
