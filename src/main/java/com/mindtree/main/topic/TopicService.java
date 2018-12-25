package com.mindtree.main.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopic(){
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(int id) {
		return topicRepository.findById(id);
	}
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	public void updateTopic(Topic topic, int id) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(int id) {
		topicRepository.deleteById(id);
	}
	
}
