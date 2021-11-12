package manyTOone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import manyTOone.domain.Employee;

public interface Emprepository extends JpaRepository<Employee,Integer> {
	
	//Employee findByempId(Integer empId);

}
