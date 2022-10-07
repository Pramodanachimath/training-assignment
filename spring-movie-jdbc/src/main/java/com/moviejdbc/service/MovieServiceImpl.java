package com.moviejdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.moviejdbc.exception.IdNotFoundException;
import com.moviejdbc.exception.MovieNotFoundException;
import com.moviejdbc.model.Movie;
import com.moviejdbc.repository.IMovieRepository;
import com.moviejdbc.util.DBQueries;

@Service
public class MovieServiceImpl implements IMovieService {
	
	
	@Autowired
	IMovieRepository movieRepository;
	
	

	public MovieServiceImpl(IMovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public void addMovie(Movie movie) {
		
		movieRepository.addMovie(movie);
	}

	@Override
	public void updateMovie(int movieId, String language) {

		movieRepository.updateMovie(movieId, language);
	}

	@Override
	public void deleteMovie(int movieId) {

		movieRepository.deleteMovie(movieId);
	}

	@Override
	public List<Movie> getAll() {

		return movieRepository.findAll();
	}

	@Override
	public List<Movie> getByName(String name) {
		try {
			return movieRepository.findByName(name);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> getByGenre(String genre) {
		try {
			return movieRepository.findByGenre(genre);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> getByLanguage(String language) {

		try {
			return movieRepository.findByLanguage(language);
		} catch (MovieNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Movie getById(int movieId) {
		try {
			return movieRepository.findById(movieId);
		} catch (IdNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
