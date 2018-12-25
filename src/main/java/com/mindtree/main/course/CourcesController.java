package com.mindtree.main.course;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.main.topic.Topic;

@RestController
public class CourcesController {

	@Autowired
	private CourcesService courcesService;
	
	@RequestMapping("/topics/{id}/cources")
	public List<Cources> getAllCources(@PathVariable int id) {
		
		return courcesService.getAllCources(id);
		
	}
	@RequestMapping("topics/{topicid}/cources/{id}")
	public Optional<Cources> getCources(@PathVariable int id) {
		return courcesService.getCources(id);
		
	}
	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/cources")
	public void addTopic(@RequestBody Cources cources,@PathVariable int topicId) {
		cources.setTopic(new Topic(topicId,""));
		courcesService.addCources(cources);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="topic/{topicId}/cources/{id}")
	public void updateCources(@RequestBody Cources cources,@PathVariable int topicId,@PathVariable int id) {
		cources.setTopic(new Topic(topicId,""));
		courcesService.updateCources(cources);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="topic/{topicId}/cources/{id}")
	public void deleteTopic(@PathVariable int id) {
		courcesService.deleteCources(id);
	}
	
}
