package com.finch.java.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "INGREDIENT")
public class Ingredient {
	@Id
	@GeneratedValue
	@Column(name="INGREDIENT_ID")
	private int id;
	private String name;
	private Double value;
	
	/*@ManyToMany(mappedBy = "ingredients")
	private List<Hamburger> hamburgers;*/

	
	public Ingredient() {}
	
	public Ingredient(int id, String name, Double value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
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
	
	
	
}
