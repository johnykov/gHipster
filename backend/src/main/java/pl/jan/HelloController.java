package pl.jan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class HelloController {

  @RequestMapping("/greet")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}