package pl.javastart.shop;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(
                new Product(1L, "Mleko", 3.8,
                        new Producer("Mleczex",
                                new Address("Warszawa", "20-222", "Wysoka 20")))
        );
        products.add(
                new Product(2L, "Czekolada mleczna", 4.2,
                        new Producer("Czokoszok",
                                new Address("Wrocław", "50-123", "Kucharska 18")))
        );
        products.add(
                new Product(3L, "Kawa rozpuszczalna", 16.99,
                        new Producer("Kaw-Pol",
                                new Address("Kraków", "10-234", "Niska 33")))
        );
    }

    List<Product> findAll() {
        return products;
    }

    List<Product> findAllByName(String name) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                results.add(product);
            }
        }
        return results;
    }

    List<Product> findAllByCity(String city) {
        List<Product> results = new ArrayList<>();
        for (Product product : products) {
            if (product.getProducer().getAddress().getCity().equalsIgnoreCase(city)) {
                results.add(product);
            }
        }
        return results;
    }

    Product findById(int id) {
        if (id > products.size()) {
            return null;
        } else {
            return products.get(id - 1);
        }
    }
}
