package springmvc1.controller;

import java.util.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url!");
		model.addAttribute("name","Armesha Sharma");
		model.addAttribute("Id",111);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Anugrah");
		friends.add("Anubhav");
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about page!!");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help page!!");

		//		creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Sagar Manoj Sharma");
		
		modelAndView.addObject("roll", 1234);
		modelAndView.setViewName("help");
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(234);
		list.add(432);
		list.add(645);
		list.add(876);
		
		modelAndView.addObject("marks",list);
		return modelAndView;
	}

}
