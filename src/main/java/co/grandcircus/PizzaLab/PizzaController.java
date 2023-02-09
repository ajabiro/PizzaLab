package co.grandcircus.PizzaLab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
//	public static void toppingList(List<String> topping) {
//		topping = new ArrayList<String>();
//		topping.add("pepperoni");
//		
//	}
//	
//	
//	String [] toppings = { "Pepperoni", "Ham", "Bacon", "Pineapple", 
//			"Banana Peppers", "Feta", "Mushrooms", "Olives" };
	
	
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
		List<String> empList = new ArrayList<>();
		empList.add("Pepperoni");
		empList.add("Olives");
		empList.add("Ham");
		empList.add("Bacon");
		empList.add("Sausage");
		empList.add("Yellow Peppers");
		empList.add("Feta");
		empList.add("Pineapple");
		empList.add("Onion");
	

		model.addAttribute("size", size);
		model.addAttribute("toppings", toppings);
		model.addAttribute("glutenfree", glutenfree);
		model.addAttribute("instructions", instructions);
		model.addAttribute("price",price);
		model.addAttribute("empList", empList);
		return "built-pizza";
	}
	
	

}
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public ModelAndView listAction() {
//
//		List<String> empList = new ArrayList<>();
//		empList.add("Pepperoni");
//		empList.add("Olives");
//		empList.add("Ham");
//		empList.add("Bacon");
//		empList.add("Sausage");
//		empList.add("Yellow Peppers");
//		empList.add("Feta");
//		empList.add("Pineapple");
//		empList.add("Onion");
//
//		ModelAndView mv = new ModelAndView();
//
//		mv.setViewName("pizza-builder");
//		mv.addObject("empList", empList);
//
//		return mv;
//
//	}
