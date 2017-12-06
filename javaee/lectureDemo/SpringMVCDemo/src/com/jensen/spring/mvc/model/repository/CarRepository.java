package com.jensen.spring.mvc.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.jensen.spring.mvc.model.Car;
import com.jensen.spring.mvc.model.HasKey;

@Repository
public class CarRepository implements GenericRepository<Car> {

	private Map<String, Car> cars = new HashMap<>();
	
	@Override
	public List<Car> findAll() {
		return new ArrayList<>(cars.values());
	}

	@Override
	public Car find(HasKey hasKey) {
		return cars.get(hasKey.getKey());
	}

	@Override
	public void remove(HasKey hasKey) {
		cars.remove(hasKey.getKey());
	}

	@Override
	public Car update(Car entity) {
		cars.put(entity.getKey(), entity);
		return entity;
	}
}
