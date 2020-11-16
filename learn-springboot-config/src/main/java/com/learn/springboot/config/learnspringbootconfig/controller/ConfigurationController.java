package com.learn.springboot.config.learnspringbootconfig.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.config.learnspringbootconfig.models.DbConnections;

@RestController
@RequestMapping("/configurations")
public class ConfigurationController {
	
	@Value("${demo.config.property}")
	private String demoProperty;
	
	@Value("${demo.list.values}")
	private List<String> demoList;
	
	@Value("#{${demo.map.values}}")
	private Map<String, String> demoMap;
	
	@Autowired
	private DbConnections dbConnections;
	
	@GetMapping
	public String configuration() {
		return "Hello from configuration controller" + " " + demoProperty +" " + demoList + " " + demoMap+ " "+dbConnections.getHost();
	}
}
