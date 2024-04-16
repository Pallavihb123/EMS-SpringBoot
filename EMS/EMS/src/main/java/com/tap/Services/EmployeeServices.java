package com.tap.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tap.Entity.Employee;
import com.tap.repo.Employeerepo;

@Component
public class EmployeeServices {

	@Autowired
	Employeerepo er;

	public List<Employee> getAllEmployee() {
		List<Employee> list = (List<Employee>) er.findAll();
		return list;
	}

	public Employee getById(int i) {
		Employee e = (Employee) er.findById(i);
		return e;

	}

	public String insertEmployee(Employee e) {
		er.save(e);
		return "record inserted";
	}

	public String updateEmployee(int i, Employee e) {
		Employee e1 = er.findById(i);
		e1.setName(e.getName());
		e1.setPhonenum(e.getPhonenum());
		e1.setName(e.getName());
		e1.setDepartment(e.getDepartment());
		e1.setEmail(e.getEmail());
		e1.setSalary(e.getSalary());
		er.save(e1);
		return "record updated";

	}

	public String deleteEmployee(int i) {
		er.deleteById(i);
		return "record deleted";

	}

}
