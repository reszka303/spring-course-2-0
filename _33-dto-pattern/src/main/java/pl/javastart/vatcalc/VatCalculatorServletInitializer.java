package pl.javastart.vatcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

class VatCalculatorServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(VatCalculatorApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(VatCalculatorApplication.class);
    }

}
