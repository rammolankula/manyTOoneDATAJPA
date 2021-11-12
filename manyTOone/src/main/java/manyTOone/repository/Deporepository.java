package manyTOone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import manyTOone.domain.Department;

public interface Deporepository extends JpaRepository<Department,Integer> {

	Department findByDepId(Integer Id);
}
