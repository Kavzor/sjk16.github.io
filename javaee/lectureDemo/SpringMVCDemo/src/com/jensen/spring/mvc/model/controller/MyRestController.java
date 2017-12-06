package com.jensen.spring.mvc.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jensen.spring.mvc.model.Car;
import com.jensen.spring.mvc.model.Employee;
import com.jensen.spring.mvc.model.repository.GenericRepository;

@RestController
public class MyRestController {

	@Autowired
	private GenericRepository<Car> carRepository;
	
	@Autowired
	private GenericRepository<Employee> employeeRepository;
	
	
	
	@RequestMapping(path = "/cars", produces = "application/json")
	public List<Car> allCars(){
		Car car = new Car();
		car.setAge(22);
		car.setReg("blab123");
		
		carRepository.add(car);
		
		car = new Car();
		car.setAge(54);
		car.setReg("bla12g");
		
		carRepository.add(car);
		return carRepository.findAll();
	}
}
