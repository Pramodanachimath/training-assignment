package com.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.movieapp.model.Movie;
import com.movieapp.model.Screen;
import com.movieapp.service.IMovieService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args){
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}
	
	@Autowired
	IMovieService movieService;

	@Override
	public void run(String... args) throws Exception {
		
		Screen screen=new Screen("");

		Movie movie=new Movie("Jackey", "Action", "Kannada", null);
		
		movieService.addMovie(null);
		
		
	}

}
