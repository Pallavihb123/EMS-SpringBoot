package com.tap.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.tap.Entity.Employee;

@Component

public interface Employeerepo extends CrudRepository<Employee, Integer> {
	Employee findById(int i);

}
