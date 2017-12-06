package com.jensen.spring.mvc.model.repository;

import java.util.List;

import com.jensen.spring.mvc.model.HasKey;

public interface GenericRepository<E extends HasKey> {

	List<E> findAll();
	
	E find(HasKey hasKey);
	
	void remove(HasKey hasKey);
	
	E update(E entity);
	
	default E add(E entity) {
		return update(entity);
	}
}
