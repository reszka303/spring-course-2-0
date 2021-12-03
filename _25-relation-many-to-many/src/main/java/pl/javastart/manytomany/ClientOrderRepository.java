package pl.javastart.manytomany;

import org.springframework.data.repository.CrudRepository;

public interface ClientOrderRepository extends CrudRepository<ClientOrder, Long> {
}
