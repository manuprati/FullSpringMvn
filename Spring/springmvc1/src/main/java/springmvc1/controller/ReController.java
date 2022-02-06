package springmvc1.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {
		@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("This is one handler");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("two");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is second hadler[enj]");
		return "redirect:/contacts";
	}

}



//@RequestMapping("/one")
//public String one(HttpServletResponse res) {
//	System.out.println("This is one");
//	try {
//		res.sendRedirect("/two");
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return "";
