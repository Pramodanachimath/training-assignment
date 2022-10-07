package com.moviejdbc.service;

import java.util.List;

import com.moviejdbc.exception.IdNotFoundException;
import com.moviejdbc.exception.MovieNotFoundException;
import com.moviejdbc.model.Movie;

public interface IMovieService {

	void addMovie(Movie movie);
	void updateMovie(int movieId,String language);
	void deleteMovie(int movieId);
	
	List<Movie> getAll();
	List<Movie> getByName(String name) throws MovieNotFoundException;
	List<Movie> getByGenre(String genre) throws MovieNotFoundException;
	List<Movie> getByLanguage(String language) throws MovieNotFoundException;
	Movie getById(int movieId) throws IdNotFoundException;
}
