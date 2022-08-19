package com.idat.service;

import java.util.List;

import com.idat.model.Pizza;

public interface PizzaService {
	
	public List<Pizza> listar();
	
	public void guardar(Pizza pizza);
	
	

}
