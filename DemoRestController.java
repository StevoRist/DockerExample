package mk.iwec.springboot.demo.myfirstapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	// expose "/" that returns something
	@GetMapping("/")
	public String sayHi() {
		return "Hello handsome! Time on the server is " + LocalDateTime.now();
	}

	// expose a new endpoint for"workout"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Jogg in the morning";
	}

//expose another ednpoint just for "fun" :)
	@GetMapping("/fun")
	public String getSomeFun() {
		return "Don't presure me, had enough";
	}
}
