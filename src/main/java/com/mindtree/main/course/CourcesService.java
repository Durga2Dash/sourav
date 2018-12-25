package com.mindtree.main.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourcesService {

	@Autowired
	private CourcesRepository courcesRepository;
	
	public List<Cources> getAllCources(int topicId){
		List<Cources> cources = new ArrayList<>();
		courcesRepository.findByTopicId(topicId)
		.forEach(cources::add);
		return cources;
	}
	public Optional<Cources> getCources(int id) {
		return courcesRepository.findById(id);
	}
	public void addCources(Cources cources) {
		courcesRepository.save(cources);
	}
	public void updateCources(Cources cources) {
		courcesRepository.save(cources);
	}
	
	public void deleteCources(int id) {
		courcesRepository.deleteById(id);
	}
	
}
