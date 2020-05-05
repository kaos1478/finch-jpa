package com.finch.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finch.java.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer>{

	Ingredient findByName(String name);

}
