package demo.springboot.multimodule.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springboot.multimodule.MyService;

@SpringBootApplication(scanBasePackages = "demo.springboot.multimodule")
@RestController
public class DemoApplication {
	
	@Autowired
	MyService myService;
	
	@GetMapping("/")
	public String home() {
		return myService.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
