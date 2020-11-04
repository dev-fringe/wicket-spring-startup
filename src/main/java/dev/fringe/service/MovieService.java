package dev.fringe.service;

import java.util.List;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.fringe.mapper.MovieMapper;
import dev.fringe.model.Movie;
import dev.fringe.repositories.MovieRepositories;
import dev.fringe.web.support.WicketUtil;

@Service
public class MovieService {
	
	@Autowired MovieRepositories repositories; //spring data jpa
	@Autowired MovieMapper mapper; //mybatis version 14 

	public List<Movie> getMovies(PageParameters params) {
		if(params.isEmpty()) {
			return repositories.findAll();
		}else {
			return mapper.select(WicketUtil.pageParametersToMap(params));
		}
	}
	
	public Movie updateMovie(Movie movie) {
		return repositories.save(movie);
	}
}
