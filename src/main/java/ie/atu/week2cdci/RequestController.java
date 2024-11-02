package ie.atu.week2cdci;
import org.springframework.web.bind.annotation.*;
@RestController
public class RequestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello there!";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name)
    {
        return "Your name is " +name;
    }
    @GetMapping ("/details")
    public String details (@RequestParam String name, @RequestParam int age)
    {
        return "Your name is " + name +" and you are " + age + " years old ";
    }
}
