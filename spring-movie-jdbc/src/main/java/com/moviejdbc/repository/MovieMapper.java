package com.moviejdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.moviejdbc.model.Movie;

public class MovieMapper implements RowMapper<Movie>{

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {

		String movieName=rs.getString("movie_name");
		String genre=rs.getString("genre");
		String language=rs.getString("language");
		int movieId=rs.getInt("movie_id");
	
		Movie movie=new Movie(movieName, genre, language, movieId);
		movie.setName(movieName);
		movie.setMovieId(movieId);
		movie.setGenre(genre);
		movie.setLanguage(language);
		return movie;
		
	}

	
}
