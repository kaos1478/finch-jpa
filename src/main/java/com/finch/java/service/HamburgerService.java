package com.finch.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finch.java.entity.Hamburger;
import com.finch.java.repository.HamburgerRepository;

@Service
public class HamburgerService {
	
	@Autowired
	private HamburgerRepository repository;
	
	public Hamburger saveHamburger(Hamburger hamburger) {
		return repository.save(hamburger);
	}
	
	public List<Hamburger> saveHamburgers(List<Hamburger> hamburgers) {
		return repository.saveAll(hamburgers);
	}
	
	public List<Hamburger> getHamburgers() {
		return repository.findAll();
	}
	
	public Hamburger getHamburgerById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Hamburger getHamburgerByName(String name) {
		return repository.findByName(name);
	}
	
	public String deleteHamburger(int id) {
		repository.deleteById(id);
		return "Hamburger "+id+" Deletado";
	}
	
	public Hamburger updateHamburger(Hamburger hamburger) {
		return repository.save(hamburger);
	}
}
