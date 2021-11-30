package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.bikerent.BikeService;
import pl.javastart.bikerent.NewBikeDto;

@SpringBootApplication
public class BikeRentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(BikeRentApplication.class, args);
//        Bike bike1 = new Bike(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 30, 100);
//        BikeRepository bikeRepository = context.getBean(BikeRepository.class);
//        bikeRepository.save(bike1);
//        System.out.println("Zapisano w bazie bike1");
//        Bike bike2 = new Bike(2L, "Trek Marlin 7, 26 cali damski", "TMAR98765", 25, 80);
//        bikeRepository.save(bike2);
//        System.out.println("Zapisano w bazie bike2");
//        System.out.println("Pobieram i wyświetlam bike2:");
//        bikeRepository.findById(2L).ifPresent(System.out::println);
//        System.out.println("Usuwam z bazy bike1");
//        bikeRepository.deleteById(1L);
//        System.out.println("Pobieram i wyświetlam bike1:");
//        bikeRepository.findById(1L).ifPresentOrElse
//                (System.out::println, () -> System.out.println("Brak roweru z id 1L"));

//        NewBikeDto bike1 = new NewBikeDto(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 30, 100);
//        BikeService bikeService = context.getBean(BikeService.class);
//        bikeService.add(bike1);
//        bike1 = new NewBikeDto(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 50, 100); //duplikat id
//        bikeService.add(bike1);

        NewBikeDto bike1 = new NewBikeDto(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 30, 100);
        BikeService bikeService = context.getBean(BikeService.class);
        bikeService.add(bike1);
        double payment = bikeService.rentForHours(1L, 5, "ABC999");
        System.out.println("Należność do zapłaty za wypożyczenie: " + payment);
        bikeService.returnBike(1L);
    }

}
