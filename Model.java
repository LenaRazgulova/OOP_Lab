package cam.it_poket;

public class Model
{


        public int film;
        public int mark;

        public int genres;

        public Model(int film, int mark, int genres)
        {
            this.film=film;
            this.mark=mark;
            this.genres=genres;
        }

        public int getFilm(){return film;}
        public void setFilm(int film){this.film=film;}

        public int getMark(){return mark;}
        public void setMark(int mark){this.mark=mark;}

        public int getGenres(){return genres;}
        public void setGenres(int genres){this.genres=genres;}

}


