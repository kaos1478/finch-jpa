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

import com.finch.java.entity.Hamburger;
import com.finch.java.entity.Ingredient;
import com.finch.java.service.HamburgerService;

@RestController
public class HamburgerController {
	
	@Autowired
	private HamburgerService service;
	
	@PostMapping("/hamburger")
	public Hamburger addHamburger(@RequestBody Hamburger hamburger) {
		//for (int i = 0 ; i < hamburger.getIngredients().size() ; i++) {
			System.out.println(hamburger.getIngredients());
		//}
		return service.saveHamburger(hamburger);
	}
	
	@PostMapping("/hamburgers")
	public List<Hamburger> addHamburgers (@RequestBody List<Hamburger> hamburgers) {
		return service.saveHamburgers(hamburgers);
	}
	
	@GetMapping("/hamburgers")
	public List<Hamburger> findAllHamburger() {
		return service.getHamburgers();
	}
	
	@GetMapping("/hamburgers/{id}")
	public Hamburger findHamburgerById(@PathVariable int id) {
		return service.getHamburgerById(id);
	}
	
	@GetMapping("/hamburgers/{name}")
	public Hamburger findHamburgerByName(@PathVariable String name) {
		return service.getHamburgerByName(name);
	}
	
	@PutMapping("/hamburgers")
	public Hamburger updateHamburger (@RequestBody Hamburger hamburger) {
		return service.updateHamburger(hamburger);
	}
	
	@DeleteMapping("/hamburgers/{id}")
	public String deleteHamburger(@PathVariable int id) {
		return service.deleteHamburger(id);
	}
}
