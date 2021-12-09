package pl.javastart.urls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class WebUrlsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(WebUrlsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(WebUrlsApplication.class);
    }
}
