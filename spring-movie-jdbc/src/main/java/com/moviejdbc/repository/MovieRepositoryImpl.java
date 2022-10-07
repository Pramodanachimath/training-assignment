package com.moviejdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.moviejdbc.exception.IdNotFoundException;
import com.moviejdbc.exception.MovieNotFoundException;
import com.moviejdbc.model.Movie;
import com.moviejdbc.util.DBQueries;

@Repository
public class MovieRepositoryImpl implements IMovieRepository {

	@Autowired
	private JdbcTemplate jdbcTemplet;
	
	public MovieRepositoryImpl(JdbcTemplate jdbcTemplet) {
		super();
		this.jdbcTemplet = jdbcTemplet;
	}

	@Override
	public void addMovie(Movie movie) {

		Object[] movieArray= {
		movie.getName(),movie.getGenre(),movie.getLanguage(),movie.getMovieId()
	};
      jdbcTemplet.update(DBQueries.INSERTQUERY, movieArray);
	}
	@Override
	public void updateMovie(int movieId, String language) {

//		String sql=DBQueries.UPDATEQUERY;
		jdbcTemplet.update(DBQueries.UPDATEQUERY,movieId,language);
	}

	@Override
	public void deleteMovie(int movieId) {

		jdbcTemplet.update(DBQueries.DELETEQUERY, movieId);
	}

	@Override
	public List<Movie> findAll() {
		
			
		RowMapper<Movie> movieMapper=new MovieMapper();
		List<Movie> movie=jdbcTemplet.query(DBQueries.SELECTQUERY, movieMapper);
		return movie;
			
	}
	Movie movie=new Movie(null, null, null, 0);
	@Override
	public List<Movie> findByName(String name) throws MovieNotFoundException {

		return jdbcTemplet.query(DBQueries.SELECTBYNAME, (rs,rowNum)->{
		
			movie.setName(rs.getString("movie_name"));
			movie.setGenre(rs.getString("genre"));
			movie.setLanguage(rs.getString("language"));
			movie.setMovieId(rs.getInt("movie_id"));
			return movie;
		}, name);
	}

	@Override
	public List<Movie> findByGenre(String genre) throws MovieNotFoundException {
		return jdbcTemplet.query(DBQueries.SELECTBYGENRE, (rs,rowNum)->{
//			Movie movie=new Movie();
			movie.setName(rs.getString("movie_name"));
			movie.setGenre(rs.getString("genre"));
			movie.setLanguage(rs.getString("language"));
			movie.setMovieId(rs.getInt("movie_id"));
			return movie;
		}, genre);
	}

	@Override
	public List<Movie> findByLanguage(String language) throws MovieNotFoundException {
		return jdbcTemplet.query(DBQueries.SELECTBYLANGUAGE, (rs,rowNum)->{
//			Movie movie=new Movie();
			movie.setName(rs.getString("movie_name"));
			movie.setGenre(rs.getString("genre"));
			movie.setLanguage(rs.getString("language"));
			movie.setMovieId(rs.getInt("movie_id"));
			return movie;
		}, language);
	}

	@Override
	public Movie findById(int movieId) throws IdNotFoundException {
		Movie movies= jdbcTemplet.queryForObject(DBQueries.SELECTBYID, (rs,rowNum)->{
//			Movie movie=new Movie();
			movie.setName(rs.getString("movie_name"));
			movie.setGenre(rs.getString("genre"));
			movie.setLanguage(rs.getString("language"));
			movie.setMovieId(rs.getInt("movie_id"));
			return movie;
		}, movieId);
		return movies;
	}
	

	
	
}
