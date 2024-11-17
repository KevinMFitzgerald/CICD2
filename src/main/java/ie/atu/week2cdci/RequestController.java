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
        return "Hello " +name+" !";
    }
    @GetMapping ("/details")
    public String details (@RequestParam String name, @RequestParam int age)
    {
        return "Name: " + name +" Age: " + age + " years old ";
    }
    @GetMapping("/calculate")
    public String calculate(@RequestParam Float num1,@RequestParam Float num2,@RequestParam String operation)
    {
        float ans;
        switch (operation)
        {
            case"add":
                ans = num1 + num2;

                break;
            case"subtract":
                ans = num1 - num2;
                break;
            case"divide":
                if(num2==0)
                {
                    return "{\"error\": \"You cannot divide by zero\"}";
                }
                else{
                    ans = (float)num1/num2;
                }
                break;
            case "multiply":
                ans = num1*num2;
                break;
            default:
                return "{\"error\": \"Please check the operator. Case Sensitive\"}";
        }
        return "{\"operation\": \"" + operation+ "\", \"total\": " + ans + "}";
    }
}
