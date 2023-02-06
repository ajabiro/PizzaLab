package co.grandcircus.PizzaLab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PizzaController {
	
	@RequestMapping("/")
	public String homepage() {
		return "index";
	}
	
	@RequestMapping("/specialty")
	public String queryStringParam(@RequestParam String name, int price, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("price", price);
		return "specialty";
	}
	@RequestMapping("/review")
	public String reviewPage() {
		return "review";
}

	@RequestMapping("submit-review")  //URL matches form action
	public String submitReview(@RequestParam String name, @RequestParam String comment, @RequestParam int rating, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("comment", comment);
		model.addAttribute("rating", rating);
		return "review-results";
		
	}
	@RequestMapping("/pizza-builder")
	public String pizzaBuilderPage() {
		return "pizza-builder";
	}
	
	@RequestMapping("submit-pizza-builder")  //URL matches form action
	public String submitBuildYourOwn(@RequestParam String size, @RequestParam int toppings,@RequestParam boolean glutenfree, @RequestParam String instructions, Model model) {
		model.addAttribute("size", size);
		model.addAttribute("toppings", toppings);
		model.addAttribute("glutenfree", glutenfree);
		model.addAttribute("instructions", instructions);
//		model.addAttribute("price",);
		return "built-pizza";
	}
	//ex. http://localhost:8080/specialty?name=HawaiianPizza
//	@RequestMapping("/specialty")
//	public String queryStringParamDemo(@RequestParam String name,@RequestParam double price, Model model) {
//		model.addAttribute("name", name);
//		model.addAttribute("price", price);
//		return "specialty";
//		}
}