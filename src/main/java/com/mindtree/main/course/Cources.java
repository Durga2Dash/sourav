package com.mindtree.main.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.mindtree.main.topic.Topic;

@Entity
public class Cources {

	@Id
	private int id;
	private String name;
	@ManyToOne
	private Topic topic;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cources() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cources(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	protected Topic getTopic() {
		return topic;
	}
	protected void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Cources(int id, String name, int topicId) {
		super();
		this.id = id;
		this.name = name;
		this.topic =new Topic(topicId,"");
	}
	
	
	
}
