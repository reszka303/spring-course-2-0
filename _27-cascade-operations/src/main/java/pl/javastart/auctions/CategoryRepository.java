package pl.javastart.auctions;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    //do poprawy query w MySQL
//    @Query(value = " SELECT Category.category_id, AVG(buy_now_Price) AS average FROM Auction WHERE category_id=:categoryId", nativeQuery = true)
    @Query("SELECT AVG(a.buyNowPrice) FROM Category c JOIN c.auctions a WHERE c.id = :categoryId")
    Optional<Double> getAvgPriceForCategory(long categoryId);
}
