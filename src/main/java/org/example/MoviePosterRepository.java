package org.example;

public class MoviePosterRepository {
    private int limitOfFilms;

    public void setLimitOfFilms(int newLimitOfFilms) {
        limitOfFilms = newLimitOfFilms;
    }


    public int getLimitOfFilms() {
        return limitOfFilms;
    }
    public MoviePosterRepository(int limitOfFilms) {
        this.limitOfFilms = limitOfFilms;
    }

    public MoviePosterRepository() {
        limitOfFilms = 10;
    }

    private MoviePoster[] posters = new MoviePoster[0];


    public void addFilm(MoviePoster poster) {
        MoviePoster[] tmp = new MoviePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public MoviePoster[] findAll() {
        return posters;
    }

    public MoviePoster[] findLast() {
        MoviePoster[] posters = findAll();
        MoviePoster[] resultlength;
        if (limitOfFilms < posters.length) {
            resultlength = new MoviePoster[limitOfFilms];
        } else {
            resultlength = new MoviePoster[posters.length];
        }
        for (int i = 0; i < resultlength.length; i++) {
            int count = posters.length - i - 1;
            resultlength[i] = posters[count];
        }
        return resultlength;
    }
}
