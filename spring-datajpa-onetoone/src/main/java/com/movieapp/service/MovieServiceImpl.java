package com.movieapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.model.Movie;
import com.movieapp.repository.IMovieRepository;
@Service
public class MovieServiceImpl implements IMovieService{

	@Autowired
	IMovieRepository movieRepository;
	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public void updateMovie(Movie movie) {
		 movieRepository.save(movie);
	}

	@Override
	public void deleteMovie(int movieId) {
		movieRepository.deleteById(movieId);
	}

	@Override
	public Movie getById(int movieId) {
		Optional<Movie> movieList= movieRepository.findById(movieId);
		if(movieList.isPresent())
			return movieList.get();
		return null;
		
	}

	@Override
	public List<Movie> getAll() {
		return movieRepository.findAll();
	}

	@Override
	public List<Movie> getByName(String name) {
		return null;
		
	}

	@Override
	public List<Movie> getByGenre(String city) {
		return null;
	}

	@Override
	public List<Movie> getByLanguage(String type) {
		return null;
	}

}
