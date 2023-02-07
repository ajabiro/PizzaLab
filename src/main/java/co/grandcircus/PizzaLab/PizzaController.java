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
	
	//ex. http://localhost:8080/specialty?name=Hawaiian Pizza&price=19.00
	//ex. http://localhost:8080/specialty?name=Meat Lover's Pizza&price=21.00
	//ex. http://localhost:8080/specialty?name=Triple Cheese&price=17.00
	@RequestMapping("/specialty")
	public String queryStringParamDemo(@RequestParam String name,@RequestParam double price, Model model) {
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
	public String submitBuildYourOwn(@RequestParam String size, @RequestParam int toppings,@RequestParam(required=false) boolean glutenfree, @RequestParam String instructions, Model model) {
		double price = 0;
		
		if(size.equals("small")) {
			price = (7 +(toppings * .50));
			
		}else if (size.equals("medium")) {
			price = (10 + (toppings * 1.00));
			
		}else if (size.equals("large")) {
			price = (12 + (toppings * 1.25));
		}
		
		double customPrice = price;
		if(glutenfree == true) {
			price+=2;
			
		}
		model.addAttribute("size", size);
		model.addAttribute("toppings", toppings);
		model.addAttribute("glutenfree", glutenfree);
		model.addAttribute("instructions", instructions);
		model.addAttribute("price",price);
		return "built-pizza";
	}

	
}