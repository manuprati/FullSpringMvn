package prodcrudapp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import prodcrudapp.dao.ProductDao;
import prodcrudapp.model.Product;

@Controller
public class MainController {

	@Autowired
	public ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Product> products = productDao.getProducts();
		m.addAttribute("products",products);
		
		return "index";
	}
	
	
	
//	show add product form
	@RequestMapping("/add-prod")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_prod_form";
	}
	
//	handle add product form
	
	@RequestMapping(value="/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest req){
		System.out.println(product);
		productDao.createProd(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest req) {
		this.productDao.deleteProd(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(req.getContextPath()+"/");
		return redirectView;

	}
	
	@RequestMapping("/update/{productId}")
	public String updateForm(@PathVariable("productId") int pid, Model m) {
		Product product = this.productDao.getProduct(pid);
		m.addAttribute("product", product);
		return "update_form";
	}
}
