package dev.fringe.web.list.link;


import org.apache.wicket.markup.html.link.Link;

import dev.fringe.web.model.Movie;

public class MovieDisplayPageLink extends Link<Object> {
    private Movie _movie;

    public MovieDisplayPageLink(String id, Movie movie) {
        super(id);
        this._movie = movie;
    }

    @Override
    public void onClick() {
        this.setResponsePage(new MovieDisplayPage(this._movie));
    }
}