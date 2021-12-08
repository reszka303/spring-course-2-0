package pl.javastart.expressions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ExpressionsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ExpressionsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ExpressionsApplication.class);
    }
}
