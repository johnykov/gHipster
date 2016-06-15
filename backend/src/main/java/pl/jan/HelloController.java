package pl.jan;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/spring")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}