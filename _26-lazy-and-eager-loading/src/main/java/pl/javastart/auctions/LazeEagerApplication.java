package pl.javastart.auctions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class LazeEagerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(LazeEagerApplication.class, args);

        AuctionRepository auctionRepository = context.getBean(AuctionRepository.class);
        CategoryRepository categoryRepository = context.getBean(CategoryRepository.class);
//        CategoryService categoryService = context.getBean(CategoryService.class);

//Najbardziej optymalne rozwiązanie przy pobieraniu średniej w tej aplikacji
//Wykorzystanie zapytania bezpośredni z bazy danych
        saveData(auctionRepository, categoryRepository);
        categoryRepository.getAvgPriceForCategory(1L)
                .ifPresent(avgPrice -> System.out.println("Średnia cena w kategorii LAPTOPY "  + avgPrice));

       categoryRepository.getAvgPriceForCategory(2L)
               .ifPresent(avgPrice -> System.out.println("Średnia cena w kategorii ŻARÓWKI " + avgPrice));


//        categoryService.getAvgPriceForCategory(1L)
//                .ifPresent(avgPresent -> System.out.println("Średnia cena w kategorii " + avgPresent));

//        printCategoryAvgAuctionPrice(1L, categoryRepository);
    }

    private static void saveData(AuctionRepository auctionRepository, CategoryRepository categoryRepository) {
        Auction auction1 = new Auction("Laptop Dell Inspirion", "Niezawodny i szybki komputer do biura i domu", 1500.0, 4999.0);
        Auction auction2 = new Auction("Macbook Pro 15 2020", "Komputer uwielbiany przez miliony", 5000.0, 7999.0);
        Auction auction3 = new Auction("Lenovo Probook 15", "Laptop, który zapewni Ci wygodną pracę", 2999.0, 5999.0);
        auctionRepository.save(auction1);
        auctionRepository.save(auction2);
        auctionRepository.save(auction3);

        Auction auction4 = new Auction("Osram 8W 4000K", "Niezawodna żarówka do biura i domu", 2.0, 15.0);
        Auction auction5 = new Auction("LSC 10.5 4000K", "Żarówka uwielbiana przez miliony", 1.5, 11.99);
        Auction auction6 = new Auction("Philips Genie 8W 2700K", "Żarówka, który zapewni Ci wygodną pracę", 2.3, 5.9);
        auctionRepository.save(auction4);
        auctionRepository.save(auction5);
        auctionRepository.save(auction6);


        Category category1 = new Category("Laptopy", "Znajdź komputer idealny dla siebie");
        category1.addAuction(auction1);
        category1.addAuction(auction2);
        category1.addAuction(auction3);

        Category category2 = new Category("Żarówki", "Znajdź żarówkę idealną dla siebie");
        category2.addAuction(auction4);
        category2.addAuction(auction5);
        category2.addAuction(auction6);


        categoryRepository.save(category1);
        categoryRepository.save(category2);
    }

    private static void printCategoryAvgAuctionPrice(Long categoryId, CategoryRepository categoryRepository) {
        Optional<Category> category = categoryRepository.findById(categoryId);
        if (category.isPresent()) {
            Category existingCategory = category.get();
            List<Auction> auctions = existingCategory.getAuctions();
            double priceSum = auctions.stream().mapToDouble(Auction::getBuyNowPrice).sum();
            double avgPrice = priceSum / auctions.size();
            System.out.printf("Średnia cena w kategorii %s to %.2f\n", existingCategory.getName(), avgPrice);
        } else {
            System.out.println("Brak kategorii o wskazanym id");
        }
    }

}
