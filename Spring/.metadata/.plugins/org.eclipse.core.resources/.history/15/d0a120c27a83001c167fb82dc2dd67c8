package springmvcsearch;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home page");
//		String str=null;
//		System.out.println(str.length());
		return "home"; 	
	}
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable ("userId") int userId,@PathVariable("userName") String userName) {
		System.out.println(userId);
		System.out.println(userName);
		Integer.parseInt(userName);
		return "home";
	}
	
//	@ExceptionHandler(value=NullPointerException.class)
//	public String nullExceptionHandler(Model m) {
//		m.addAttribute("msg","Null pointer exception occured");
//		return "nullpage";
//	}
//	@ExceptionHandler(value=NumberFormatException.class)
//	public String formatExceptionHandler(Model m) {
//		m.addAttribute("msg","Number Format exception occured");
//		return "nullpage";
//	}
//	
//	@ExceptionHandler(value=Exception.class)
//	public String genericExceptionHandler(Model m) {
//		m.addAttribute("msg","Exception occured");
//		return "nullpage";
//	}
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
//	public String nullExceptionHandler() {
//		return "nullpage";
//	}
/*	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("msg","Please dont leave name value empty");
		
	}
	@RequestMapping("/search")
	public String handleForm(@ModelAttribute("querybox") String query) {
		if (query.isEmpty()) 
			return "redirectView:/search";
		
	}*/
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
						
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		if (query.isEmpty()) {
			redirectView.setUrl("redirect:/search");
		}
		
		return redirectView;
	}
}
