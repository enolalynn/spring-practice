package com.enola.mappings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inputs")
public class InputsController {
	@GetMapping
	public void index() {
		
	}
	
	@GetMapping("{type}/search/{id:\\d+}")
	public String findByType(
			@PathVariable String type,
			@PathVariable Integer id,
			Model model
			) {
		model.addAttribute("type", type);
		model.addAttribute("id",id);
		
		return "inputs";
	}
}
