package pl.javastart.thymform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ThymeleafFormServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ThymeleafFormApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafFormApplication.class);
    }
}
