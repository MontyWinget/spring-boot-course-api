package com.springbootquickstart.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * Creating RESTFULL API 
*/
@RestController
public class TopicController {

	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Sprign framework Description"),
				new Topic("Java", "Core Java", "Core Java Description"),
				new Topic("JavaScript", "JavaScript Language", "JavaScript Description")
				);
	}
	
}
