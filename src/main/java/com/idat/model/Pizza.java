package com.idat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name= "pizza")
@Data
@AllArgsConstructor
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpizza;
	private String nombrepizza;
	private String descripcion;
	
	

}
