package pl.javastart.loops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

class LoopsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(LoopsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(LoopsApplication.class);
    }
}
