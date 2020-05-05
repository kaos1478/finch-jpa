package com.finch.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.finch.java.entity.Ingredient;
import com.finch.java.service.IngredientService;

@RestController
public class IngredientController {
	
	@Autowired
	private IngredientService service;
	
	@PostMapping("/ingredient")
	public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
		return service.saveIngredient(ingredient);
	}
	
	@PostMapping("/ingredients")
	public List<Ingredient> addIngredients(@RequestBody List<Ingredient> ingredients) {
		return service.saveIngredients(ingredients);
	}
	
	@GetMapping("/ingredients")
	public List<Ingredient> findAllIngredients() {
		return service.getIngredients();
	}
	
	@GetMapping("/ingredients/{id}")
	public Ingredient findIngredientById(@PathVariable int id) {
		return service.getIngredientById(id);
	}
	
	@GetMapping("/ingredients/{name}")
	public Ingredient findIngredientByName(@PathVariable String name) {
		return service.getIngredientByName(name);
	}
	
	@PutMapping("/ingredients")
	public Ingredient updateIngredient (@RequestBody Ingredient ingredient) {
		return service.updateIngredient(ingredient);
	}
	
	@DeleteMapping("/ingredients/{id}")
	public String deleteIngredient(@PathVariable int id) {
		return service.deleteIngredient(id);
	}
}
