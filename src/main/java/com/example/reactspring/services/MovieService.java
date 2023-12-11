package com.example.reactspring.services;

import com.example.reactspring.models.Movie;
import com.example.reactspring.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
