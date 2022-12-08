package cam.it_poket;
import cam.it_poket.DataProcessor;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> movies = new ArrayList<>(Arrays.asList(
                new Films(1, 5, 1),
                new Films(5, 3, 1),
                new Films(17, 4, 2),
                new Films(31, 3, 4),
                new Soap_opera(1, 5, 1, 8),
                new Soap_opera(5, 3, 2, 9)
        ));
        List<Book> filteredList = DataProcessor.filterByMark(3, 5, movies);
        Optional<Book> candidateForSearch = DataProcessor.findByMark(5, movies);
        for (Book item : filteredList) {
            item.printInfo();
        }
        System.out.println("Сортировка:");

        if (candidateForSearch.isPresent()) {
            candidateForSearch.get().printInfo();
        } else {
            System.out.println("Не найдено ни одного элемента");
        }
        System.out.println("----------------------");
    }
}

