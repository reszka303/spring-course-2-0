package pl.javastart.shop;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    List<Product> getProduct(@RequestParam(required = false) @PathVariable String name) {
        if (name == null) {
            return productRepository.findAll();
        } else {
            return productRepository.findAllByName(name);
        }
    }

    @GetMapping("/{id}")
    ResponseEntity<Product> getProductById(@PathVariable Integer id) {
        return productRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/producer")
    ResponseEntity<Producer> getProducerByProductId(@PathVariable Integer id) {
        return productRepository.findById(id)
                .map(Product::getProducer)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //    @GetMapping
//    List<Product> getProductByCity(@RequestParam(required = false) @PathVariable String city) {
//        if (city == null) {
//            return productRepository.findAll();
//        } else {
//            return productRepository.findAllByCity(city);
//        }
//    }
}
