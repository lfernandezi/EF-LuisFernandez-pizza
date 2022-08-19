package com.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.model.Pizza;
import com.idat.repository.PizzaRepository;

@Service
public class PizzaServiceImp implements PizzaService{

	@Autowired 
	PizzaRepository pizzarepo;


	@Override
	public List<Pizza> listar() {
		// TODO Auto-generated method stub
		return pizzarepo.findAll();
	}

	@Override
	public void guardar(Pizza pizza) {
		pizzarepo.save(pizza);
		
	}

}
