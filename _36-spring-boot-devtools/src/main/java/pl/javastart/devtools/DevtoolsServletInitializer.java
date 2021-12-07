package pl.javastart.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

class DevtoolsServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DevtoolsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DevtoolsApplication.class);
    }

}
