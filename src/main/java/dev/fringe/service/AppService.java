package dev.fringe.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import dev.fringe.model.Movie;

@Service
public class AppService {

	public void print() {
		System.out.println("call spring service");
	}

	public List<Movie> getMovies() {
		return 	Arrays.asList(new Movie("The Shining", 1980), new Movie("Barton Fink", 1991), new Movie("Barton Fink", 1991));
	}
}
