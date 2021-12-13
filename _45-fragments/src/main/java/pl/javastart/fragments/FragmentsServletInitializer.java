package pl.javastart.fragments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class FragmentsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FragmentsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FragmentsApplication.class);
    }
}
