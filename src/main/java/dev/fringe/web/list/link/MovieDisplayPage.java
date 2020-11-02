package dev.fringe.web.list.link;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

import dev.fringe.model.Movie;

public class MovieDisplayPage extends WebPage {
	
	private static final long serialVersionUID = 1829893490863391887L;
	
    public MovieDisplayPage(Movie movie) {
        add(new Label("title", movie.getTitle()));
        add(new Label("year", movie.getYear().toString())); 
    }
}