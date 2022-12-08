package cam.it_poket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ItemsUtils {
    public static void PrintInfo(AllPrint[] items){
        for (AllPrint item : items){
            item.printInfo();
        }
    }

    public static void PrintStatistics(ArrayList<Book> movies){
        {
            int itemsCount = 0;
            double sumOfItemsMark = 0;
            int maxItemMark = 0;
            int minItemMark = 1000;
            int minRatedItem = 1000;
            int maxRatedItem = 0;
            Map<Integer, Integer> itemGenresWatched = new HashMap<>();
            Map<Integer, Integer> itemGenresAllMark = new HashMap<>();

            for (Book filmItem : movies){
                itemsCount++;
                sumOfItemsMark += filmItem.mark;
                int mark = filmItem.mark;

                if (itemGenresWatched.containsKey(filmItem.genres)){
                    int stat = itemGenresWatched.get(filmItem.genres);
                    itemGenresWatched.put(filmItem.genres, stat + 1);
                } else  {
                    itemGenresWatched.put(filmItem.genres, 1);
                }

                if (itemGenresAllMark.containsKey(filmItem.genres)){
                    int genresMark = itemGenresAllMark.get(filmItem.genres);
                    itemGenresAllMark.put(filmItem.genres, genresMark + mark);
                } else {
                    itemGenresAllMark.put(filmItem.genres, mark);
                }

                if (maxItemMark <= mark){
                    maxItemMark = mark;
                    maxRatedItem = filmItem.name;
                }
            }
            double averageFilmMark = sumOfItemsMark / itemsCount;
            PrintItemStatistic(averageFilmMark, maxRatedItem, minRatedItem, itemGenresWatched, itemGenresAllMark);
        }
    }

    private static void PrintItemStatistic(double averageMark, int maxRatedFilm, int minRatedFilm, Map<Integer, Integer> genresWatched, Map<Integer, Integer> genresAllMark){
        System.out.println("Средняя оценка " + averageMark);
        System.out.println("Максимальная оценка" + maxRatedFilm);
        System.out.println("Минимальная оценка" + minRatedFilm);
        Integer[] genresSet = genresWatched.keySet().toArray(new Integer[0]);
        for (int s : genresSet){
            double averageGenresMark = (double) genresAllMark.get(s) / genresWatched.get(s);
            System.out.println("Жанр: " + s + ", Просмотрено: " + genresWatched.get(s) + ", средняя оценка: " + averageGenresMark);
        }
        System.out.println("    ");
    }
}
