package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterRepositoryTest {
    MoviePoster poster1 = new MoviePoster("Бладшот");
    MoviePoster poster2 = new MoviePoster("Вперед");
    MoviePoster poster3 = new MoviePoster("Отель Белград");
    MoviePoster poster4 = new MoviePoster("Джентельмены");
    MoviePoster poster5 = new MoviePoster("Человек-невидимка");

    @Test

    public void addFilmTest() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.addFilm(poster1);
        repo.addFilm(poster2);
        repo.addFilm(poster3);
        repo.addFilm(poster4);
        repo.addFilm(poster5);
        MoviePoster[] expected = {poster1, poster2, poster3, poster4, poster5};
        MoviePoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast1() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.addFilm(poster1);
        repo.addFilm(poster2);
        repo.addFilm(poster3);
        repo.addFilm(poster4);
        repo.addFilm(poster5);
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLast2() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.addFilm(poster3);
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {poster3};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLast3() {
        MoviePosterRepository repo = new MoviePosterRepository();
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLast4() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.getLimitOfFilms();

        repo.addFilm(poster1);
        repo.addFilm(poster2);
        repo.addFilm(poster3);
        repo.addFilm(poster4);
        repo.addFilm(poster5);
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLast5() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.setLimitOfFilms(15);
        repo.getLimitOfFilms();

        repo.addFilm(poster1);
        repo.addFilm(poster2);
        repo.addFilm(poster3);
        repo.addFilm(poster4);
        repo.addFilm(poster5);
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(actual, expected);
    }
}
