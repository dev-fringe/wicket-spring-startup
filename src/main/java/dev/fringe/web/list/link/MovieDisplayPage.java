package dev.fringe.web.list.link;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import dev.fringe.web.model.Movie;

public class MovieDisplayPage extends WebPage {
	
	private static final long serialVersionUID = 1829893490863391887L;
	
	private Movie _movie;

    public MovieDisplayPage(Movie movie) {
        this._movie = movie;
        this.add(new Label("title", movie.getTitle()));
        this.add(new Label("year", movie.getYear().toString()));
    }

    public Movie getMovie() {
        return this._movie;
    }
}