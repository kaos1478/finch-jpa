package com.finch.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finch.java.entity.Ingredient;
import com.finch.java.repository.IngredientRepository;

@Service
public class IngredientService {

	@Autowired
	private IngredientRepository repository;
	
	public Ingredient saveIngredient(Ingredient ingredient) {
		return repository.save(ingredient);
	}
	
	public List<Ingredient> saveIngredients(List<Ingredient> ingredients) {
		return repository.saveAll(ingredients);
	}
	
	public List<Ingredient> getIngredients(){
		return repository.findAll();
	}
	
	public Ingredient getIngredientById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public Ingredient getIngredientByName(String name){
		return repository.findByName(name);
	}
	
	public String deleteIngredient(int id) {
		repository.deleteById(id);
		return "Ingredient "+id+" removido";
	}
	
	public Ingredient updateIngredient(Ingredient ingredient) {
		return repository.save(ingredient);
	}
}
