package cam.it_poket;

public class Book implements AllPrint {
    public int name;
    public int mark;
    public int genres;

    public Book(int name, int mark, int genres) {
        this.name = name;
        this.mark = mark;
        this.genres = genres;
    }

    @Override
    public void printInfo() {
        System.out.println("Фильм: " + this.name + ", Оценка: " + this.mark + ", Жанр: " + this.genres);
    }
}
