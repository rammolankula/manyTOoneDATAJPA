package manyTOone.runner;

import org.hibernate.hql.internal.ast.tree.DotNode.DereferenceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import manyTOone.domain.Department;
import manyTOone.domain.Employee;
import manyTOone.repository.Deporepository;
import manyTOone.repository.Emprepository;
@Component
public class Emprunner implements CommandLineRunner {

	@Autowired
	private Emprepository erepo;
	
	@Autowired
	private Deporepository drepo;
	
	@Override
	public void run(String... args) throws Exception {

		erepo.save(new Employee(1,"Ram","siddipet","dev",drepo.findByDepId(11)));
		erepo.save(new Employee(2,"Ram","siddipet","dev",drepo.findByDepId(11)));
		erepo.save(new Employee(3,"Ram","siddipet","dev",drepo.findByDepId(11)));
		erepo.save(new Employee(5,"Ram","siddipet","dev",drepo.findByDepId(12)));
		erepo.save(new Employee(6,"Ram","siddipet","dev",drepo.findByDepId(12)));
		erepo.save(new Employee(7,"Ram","siddipet","dev",drepo.findByDepId(13)));
		
	}

}
