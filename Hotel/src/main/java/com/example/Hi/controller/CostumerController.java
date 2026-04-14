package com.example.Hi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Hi.model.Costumer;
import com.example.Hi.repository.CostumerRepo;

@Controller
public class CostumerController {
	
	@Autowired
	private CostumerRepo crepo;
	@GetMapping("/Costumer")
	public String gecos() {
		return"Costumer";
	}
	
	@PostMapping("/Costumer")
	public String postcos(@ModelAttribute Costumer costumer) {
		crepo.save(costumer);
		return"Costumer";
	}

}
