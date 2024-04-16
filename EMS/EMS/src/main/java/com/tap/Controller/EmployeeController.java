package com.tap.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tap.Entity.Employee;
import com.tap.Services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServices es;

	@GetMapping("/employee")
	

	public List<Employee> getAllEmplyee() {
		return es.getAllEmployee();
	}

	@GetMapping("/employee/{id}")
	public Employee getById(@PathVariable("id") int i) {
		return es.getById(i);
	}

	@PostMapping("/employee")
	public String insert(@RequestBody Employee e) {
		return es.insertEmployee(e);
	}

	@PutMapping("/employee/{id}")

	public String update(@RequestBody Employee e, @PathVariable("id") int i) {
		return es.updateEmployee(i,e);
	}

	@DeleteMapping("/employee/{id}")
	public String delete(@PathVariable("id") int i) {
		return es.deleteEmployee(i);
	}
}
