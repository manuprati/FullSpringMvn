package com.practice.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public String about(Model model) {
		model.addAttribute("name","Manoj Kumar Sharma");
		model.addAttribute("Date",new Date().toLocaleString());
		return "about";
	}
	
	@GetMapping("example-loop")
	public String iterateHandler(Model m) {
		
		List<String> list = new ArrayList<String>();
		list.add("Laxmi");
		list.add("PapaJi");
		list.add("Mammy");
		list.add("Chhotu");
		System.out.println(list);
		
		m.addAttribute("names",list);
		
		return "iterate";
	}
	
	@GetMapping("condition")
	public String conditionHandler(Model m) {
		System.out.println("Executing condition handler");
		m.addAttribute("isActive",false);
		m.addAttribute("gender","M");
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(34);
		list1.add(45);
		list1.add(63);
		list1.add(67);
		m.addAttribute("mylist",list1);
		System.out.println("mylist");
		return "condition";
			
	}
	
	@GetMapping("newabout")
	public String newAbout() {
		return "aboutnew";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/service")
	public String servicesHandler(Model m) {
		m.addAttribute("title","I love my family");
		m.addAttribute("subtitle",LocalDateTime.now().toString());
		return "service";
	}

}
