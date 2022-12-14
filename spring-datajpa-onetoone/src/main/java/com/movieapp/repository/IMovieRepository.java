package com.movieapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.movieapp.model.Movie;

@Repository
public interface IMovieRepository extends JpaRepository<Movie, Integer>{

}
