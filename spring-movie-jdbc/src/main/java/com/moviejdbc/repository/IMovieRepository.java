package com.moviejdbc.repository;

import java.util.List;

import com.moviejdbc.exception.IdNotFoundException;
import com.moviejdbc.exception.MovieNotFoundException;
import com.moviejdbc.model.Movie;

public interface IMovieRepository {

	void addMovie(Movie movie);
	void updateMovie(int movieId,String language);
	void deleteMovie(int movieId);
	
	List<Movie> findAll();
	List<Movie> findByName(String name) throws MovieNotFoundException;
	List<Movie> findByGenre(String genre)  throws MovieNotFoundException;
	List<Movie> findByLanguage(String language)  throws MovieNotFoundException;
	Movie findById(int movieId)  throws IdNotFoundException;
	
}
