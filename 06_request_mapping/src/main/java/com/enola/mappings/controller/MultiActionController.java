package com.enola.mappings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("multi")
public class MultiActionController {
	@RequestMapping
	public void index() {
		
	}
	@RequestMapping("/action1")
	public String action1(ModelMap model) {
		model.put("message", "Action 1");
		return "multi";
	}
	@GetMapping("/action1")
	public String action1WithParam(ModelMap model) {
		model.put("message", "Action 1 with id Parameter");
		return "multi";
	}
	
	@RequestMapping("/action2")
	public String action2(ModelMap model) {
		model.put("message", "Action 2");
		return "multi";
	}
	
	@RequestMapping("**")
	public String actionWildCard(ModelMap model) {
		model.put("message", "Other Action");
		return "multi";
	}
	@RequestMapping("{:\\d+}")
	public String actionDigit(ModelMap model) {
		model.put("message", "Digit");
		return "multi";
	}
}
