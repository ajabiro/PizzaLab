package co.grandcircus.PizzaLab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSTLController {

		@RequestMapping("/jstl")
		public String jstlPractice() {
			return "jstl";
		}
		
		// <h2> Your selected fruits are: </h2>
		// <c:forEach car="value" item="${paramValues['key']}">
		//	<i><c:out value="${value} /><?i><br />"
		//	</c:forEach>
}
