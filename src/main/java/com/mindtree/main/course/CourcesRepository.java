package com.mindtree.main.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;



public interface CourcesRepository extends CrudRepository<Cources, Integer> {

	
	public List<Cources> findByTopicId(int topicId);
	
	
}
