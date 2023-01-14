package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviePosterRepositoryTest {
    MoviePoster poster1 = new MoviePoster("Бладшот");
    MoviePoster poster2 = new MoviePoster("Вперед");
    MoviePoster poster3 = new MoviePoster("Отель Белград");
    MoviePoster poster4 = new MoviePoster("Джентельмены");
    MoviePoster poster5 = new MoviePoster("Человек-невидимка");
    MoviePoster poster6 = new MoviePoster("Форсаж");
    MoviePoster poster7 = new MoviePoster("Трансформеры");
    MoviePoster poster8 = new MoviePoster("Гарри Поттер");
    MoviePoster poster9 = new MoviePoster("Титаник");
    MoviePoster poster10 = new MoviePoster("Майор Пейн");

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

    @Test
    public void shouldFindLast6() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.getLimitOfFilms();
        repo.addFilm(poster1);
        repo.addFilm(poster2);
        repo.addFilm(poster3);
        repo.addFilm(poster4);
        repo.addFilm(poster5);
        repo.addFilm(poster6);
        repo.addFilm(poster7);
        repo.addFilm(poster8);
        repo.addFilm(poster9);
        repo.addFilm(poster10);
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {poster10, poster9, poster8, poster7, poster6, poster5, poster4, poster3, poster2, poster1};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLast7() {
        MoviePosterRepository repo = new MoviePosterRepository();
        repo.setLimitOfFilms(5);
        repo.getLimitOfFilms();

        repo.addFilm(poster1);
        repo.addFilm(poster2);
        repo.addFilm(poster3);
        repo.addFilm(poster4);
        repo.addFilm(poster5);
        repo.addFilm(poster6);
        repo.addFilm(poster7);
        repo.addFilm(poster8);
        repo.addFilm(poster9);
        repo.addFilm(poster10);
        MoviePoster[] actual = repo.findLast();
        MoviePoster[] expected = {poster10, poster9, poster8, poster7, poster6};
        Assertions.assertArrayEquals(actual, expected);
    }
}
