package com.finch.java.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Verificar depois porque o Swagger não funciona com o Lombok
/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name = "HAMBURGER")
public class Hamburger {
	@Id
	@GeneratedValue
	@Column(name = "HAMBURGER_ID")
	private int id;
	private String name;
	private Double value;
	@ManyToMany
    @JoinTable(
            name = "HAMBURGER_INGREDIENT",
            joinColumns = {@JoinColumn(name = "HAMBURGER_ID")},
            inverseJoinColumns = {@JoinColumn(name = "INGREDIENT_ID")}
    )
	private List<Ingredient> ingredients;
	
	public Hamburger() {}
	
	public Hamburger(int id, String name, Double value, List<Ingredient> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
		this.ingredients = ingredients;
	}
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
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	
}
