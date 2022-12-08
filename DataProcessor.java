package cam.it_poket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DataProcessor<T> {
    public static List<Book> filterByMark(Integer min, Integer max, ArrayList<Book> list) {

        List<Book> filteredList = list.stream()
                .filter(item -> item.mark >= min && item.mark < max)
                .sorted((a, b) -> {
                    return Integer.compare(a.mark, b.mark);
                })
                .limit(3)
                .toList();

        return filteredList;
    }

    public static Optional<Book> findByMark(Integer mark, ArrayList<Book> list){
        System.out.println("Поиск:");
        Optional<Book> candidateForSearch = list.stream()
                .filter(item -> item.mark == mark).findFirst();

        return candidateForSearch;
    }
}
