package com.finch.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finch.java.entity.Hamburger;

public interface HamburgerRepository extends JpaRepository<Hamburger, Integer> {
	
	Hamburger findByName(String name);

}
