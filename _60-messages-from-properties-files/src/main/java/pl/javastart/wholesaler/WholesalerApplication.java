package pl.javastart.wholesaler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.wholesaler.model.Equipment;
import pl.javastart.wholesaler.model.Product;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Locale;
import java.util.Set;

@SpringBootApplication
public class WholesalerApplication {

    public static void main(String[] args) {
//        Locale.setDefault(new Locale("pl"));
//        Locale.setDefault(new Locale("en"));
        ConfigurableApplicationContext context =
                SpringApplication.run(WholesalerApplication.class, args);

        Validator validator = context.getBean(Validator.class);

        Product product1 = new Product(
                "Dell XPS 15",
                "Laptop 15 calowy z 2021 roku",
//                "PL13243"
                "PLL13243"
        );

        Set<ConstraintViolation<Product>> productConstraintViolations = validator.validate(product1);
        if (!productConstraintViolations.isEmpty()) {
            System.out.println("Nieprawidłowy produkt, złamane ograniczenia:");
            productConstraintViolations.stream()
                    .map(ConstraintViolation::getMessage)
                    .forEach(System.out::println);
        }

        Equipment equipment1 = new Equipment(
                "iPhone 13",
                "KARNOW123",
//                "EQ7986"
                "AB123"
        );

        Set<ConstraintViolation<Equipment>> equipmentConstraintViolations = validator.validate(equipment1);
        if (!equipmentConstraintViolations.isEmpty()) {
            System.out.println("Nieprawidłowe wyposażenie, złamane ograniczenia:");
            equipmentConstraintViolations.stream()
                    .map(ConstraintViolation::getMessage)
                    .forEach(System.out::println);
        }
    }
}
