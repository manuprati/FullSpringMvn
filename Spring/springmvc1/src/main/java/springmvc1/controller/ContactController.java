package springmvc1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc1.model.User;
import springmvc1.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header","Brijpushpa the Great!");
		m.addAttribute("Desc","Learn Programming with Manoj");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contacts")
	public String showForm(Model m) {
		System.out.println("Showing data");
			return "contacts";
	}
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		if (user.getUserName().isEmpty()) {
			return "redirect:/contacts";
		}
		int createdUser = this.userService.createUser(user);
		model.addAttribute("msg","Created user successfully with Id :"+createdUser);
			return "success";
	}

}





/*
 * @RequestMapping("/contacts")
	public String showForm() {
		return "contacts";
	}
	
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("userName") String userName, 
			@RequestParam("email") String userEmail, 
			@RequestParam("password") String userPassword, Model model) {
		User user = new User();
		user.setUserName(userName);
		user.setEmail(userEmail);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
//		model.addAttribute("usernm",name);
//		model.addAttribute("eml",userEmail);
//		model.addAttribute("pswd",password);
		
		model.addAttribute("user",user);
				return "success";
	}
	*/
