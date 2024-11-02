package ie.atu.week2cdci;
import org.springframework.web.bind.annotation.*;
@RestController
public class RequestController {
    @GetMapping("/Hello")
    public String sayHello() {
        return "Hello there!";
    }
}
