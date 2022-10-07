package com.movieapp.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Movie {

	@Column(name="moviename",length = 20)
	private String Name;
	@Column(length = 20)
	private String genre;
	@Column(length = 20)
	private String language;
	@Id
	@GeneratedValue(generator = "movie_gen",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "movie_gen",sequenceName = "movie_sequence",initialValue = 1,allocationSize = 1)
	private int movieId;
	private Screen screen;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String name, String genre, String language, Screen screen) {
		super();
		Name = name;
		this.genre = genre;
		this.language = language;
		this.screen = screen;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Movie [Name=" + Name + ", genre=" + genre + ", language=" + language + ", movieId=" + movieId + "]";
	}
	
	
}
