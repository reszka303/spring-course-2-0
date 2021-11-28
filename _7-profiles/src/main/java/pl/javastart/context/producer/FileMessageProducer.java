package pl.javastart.context.producer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

@Service
@Profile("file")
public class FileMessageProducer implements MessageProducer {

    @Override
    public String getMessage() {
        Path path = getPath();

        //Sprawdza z jakiej ścieżki odczytuje wpisaną nazwę pliku.
        //Inaczej mówiąc, gdzie powinien znajdować sie plik, aby został odczytany przez metodę główną
        System.out.println("Plik znajduje się pod następującą ścieżką: " + path.toAbsolutePath());
        System.out.println();

        try {
            System.out.println("Treść pliku:");
            return String.join(" ", Files.readAllLines(path));
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private Path getPath() {
        System.out.println("Podaj nazwę pliku z komunikatem do odczytania");
        Scanner scanner = new Scanner(System.in);
        String filePath = "D:/INNE/Programowanie/Projects/spring-course-2-0/_7-profiles/src/main/resources/";
        String fileName = filePath + scanner.nextLine();
        return Path.of(fileName);
    }

}
