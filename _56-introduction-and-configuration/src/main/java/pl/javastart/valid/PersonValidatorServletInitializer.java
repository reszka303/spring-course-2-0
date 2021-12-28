package pl.javastart.valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class PersonValidatorServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PersonValidatorApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(PersonValidatorApplication.class);
    }
}
