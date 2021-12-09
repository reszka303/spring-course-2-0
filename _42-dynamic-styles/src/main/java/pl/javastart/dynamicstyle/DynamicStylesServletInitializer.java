package pl.javastart.dynamicstyle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class DynamicStylesServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DynamicStylesApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DynamicStylesApplication.class);
    }
}
