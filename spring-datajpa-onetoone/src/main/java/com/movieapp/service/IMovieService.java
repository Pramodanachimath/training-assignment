package com.movieapp.service;

import java.util.List;

import com.movieapp.model.Movie;

public interface IMovieService {

	Movie addMovie(Movie movie);
	void updateMovie(Movie movie);
	void deleteMovie(int movieId);
	Movie getById(int movieId);
	List<Movie> getAll();

	List<Movie> getByName(String name);
	List<Movie> getByGenre(String city);
	List<Movie> getByLanguage(String type);
	
}
