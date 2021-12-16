package pl.javastart.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ContentNegotiationApplicationServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ContentNegotiationApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ContentNegotiationApplication.class);
    }
}
