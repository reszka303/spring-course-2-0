package pl.javastart.instructions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

class InstructionsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(InstructionsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(InstructionsApplication.class);
    }
}
