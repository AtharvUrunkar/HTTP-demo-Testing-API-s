package com.example.demo.controllers;

import com.example.demo.model.Property;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

	private List<Property> properties = new ArrayList<>();

	@PostMapping
	public String addProperty(@RequestBody Property property){
		properties.add(property);
		return "Property added";
	}

	@GetMapping
	public List<Property> getAll(){
		return properties;
	}

	@GetMapping("/{id}")
	public Property getProperty(@PathVariable Long id){
		return properties.stream()
				.filter(p -> p.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
}