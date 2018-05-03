package Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//@Controller annotation is an annotation used in Spring MVC (Model Viewer Controller, 3 things in one) framework 
//(the component of Spring Framework used to implement Web Application
@Controller 
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/") //we are mapping "/" directly to a method inside this class. You request to connect to Spring Controller
	@ResponseBody //after the request above, then you create a response back from Spring Controller to Client (PRS)
	String home() {
		return "Hello Java Boot Camp";
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);

	}

}
