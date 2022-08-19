package com.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.idat.model.Pizza;
import com.idat.service.PizzaService;



@RestController
@RequestMapping("/v1/pizza")
public class PizzaController {
	
	@Autowired
	private PizzaService pizzaserv;
	
	@GetMapping("listar")
	public @ResponseBody List<Pizza> listar(){
		return pizzaserv.listar();
		
	}
	
	@PostMapping("guardar")
	public @ResponseBody void guadar (Pizza p) {
		pizzaserv.guardar(p);
	}
	
	

}
