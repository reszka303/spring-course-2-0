package pl.javastart.params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

    @GetMapping("/hello")
    @ResponseBody
    String hello(@RequestParam(required = false, defaultValue = "stranger") String name,
                 @RequestHeader(name = "User-Agent") String userAgent) {
        System.out.println("User Agent klienta: " + userAgent );
        return "Hello " + name;
    }

//MVC jest dodatkową warstwą abstrakcji nad specyfikacją serwletów
    @GetMapping("/add")
    @ResponseBody
    String add(@RequestParam double a, @RequestParam double b) {
        double sum = a + b;
        return String.format("%.2f + %.2f = %.2f", a, b, sum);
    }

    //obsługa żądań przez serwlety
//    @GetMapping("/add")
//    @ResponseBody
//    String add(HttpServletRequest request) {
//        String a = request.getParameter("a");
//        String b = request.getParameter("b");
//        double aValue = Double.parseDouble(a);
//        double bValue = Double.parseDouble(b);
//        double sum = aValue + bValue;
//        return String.format("%.2f + %.2f = %.2f", aValue, bValue, sum);
//    }
}
