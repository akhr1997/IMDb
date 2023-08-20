package com.ashwinhr.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRespository movieRespository;
    public List<Movie> allMovies(){
        System.out.println(movieRespository.findAll().toString());
        return movieRespository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRespository.findMovieByImdbId(imdbId);
    }
}
