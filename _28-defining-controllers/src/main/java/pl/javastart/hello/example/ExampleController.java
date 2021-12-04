package pl.javastart.hello.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @RequestMapping("/first/**") //wieloznacznik - "/**" dozwolone
    @ResponseBody
    String first() {
        return "Tekst z metody first()";
    }

    @RequestMapping("/second")
    @ResponseBody
    String second() {
        return "Tekst z metody second()";
    }
}
