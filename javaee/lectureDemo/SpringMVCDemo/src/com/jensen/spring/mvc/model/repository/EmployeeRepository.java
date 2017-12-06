package com.jensen.spring.mvc.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jensen.spring.mvc.model.Car;
import com.jensen.spring.mvc.model.Employee;
import com.jensen.spring.mvc.model.HasKey;

@Repository
public class EmployeeRepository implements GenericRepository<Employee> {

	private Map<String, Employee> employees = new HashMap<>();
	
	@Override
	public List<Employee> findAll() {
		return new ArrayList<>(employees.values());
	}

	@Override
	public Employee find(HasKey hasKey) {
		return employees.get(hasKey.getKey());
	}

	@Override
	public void remove(HasKey hasKey) {
		employees.remove(hasKey.getKey());
	}

	@Override
	public Employee update(Employee entity) {
		employees.put(entity.getKey(), entity);
		return entity;
	}
}
