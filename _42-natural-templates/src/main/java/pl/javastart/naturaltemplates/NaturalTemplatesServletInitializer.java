package pl.javastart.naturaltemplates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class NaturalTemplatesServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(NaturalTemplatesApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(NaturalTemplatesApplication.class);
    }
}
