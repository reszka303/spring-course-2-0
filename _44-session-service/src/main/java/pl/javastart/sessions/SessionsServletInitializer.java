package pl.javastart.sessions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class SessionsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SessionsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SessionsApplication.class);
    }
}
