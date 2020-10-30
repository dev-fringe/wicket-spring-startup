package dev.fringe.web.list;

import java.util.LinkedList;
import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.wicketstuff.annotation.mount.MountPath;

import dev.fringe.web.list.link.MovieDisplayPageLink;
import dev.fringe.web.model.Movie;

@MountPath(value = "/movie_list")
public class MovieList extends WebPage {
	private static final long serialVersionUID = 5445215802445940184L;

	public MovieList() {
		List<Movie> movies = new LinkedList<Movie>();
		Movie movie1 = new Movie("The Shining");
		movie1.setYear(1980);
		movies.add(movie1);
		Movie movie2 = new Movie("Barton Fink");
		movie2.setYear(1991);
		movies.add(movie2);
        ListView movieListView = new ListView("movie_list", movies) {
			private static final long serialVersionUID = 5745749838922549850L;
			protected void populateItem(ListItem item) {
				Movie movie = (Movie) item.getModelObject();
				MovieDisplayPageLink movieLink = new MovieDisplayPageLink("movie_link", movie);
				movieLink.add(new Label("title", movie.getTitle()));
				movieLink.add(new Label("year", movie.getYear().toString()));
				item.add(movieLink);
            }
        };
//        PropertyListView movieListView =
//                new PropertyListView("movie_list", movies) {
//                    private static final long serialVersionUID = 1L;
//
//                    @Override
//                    protected void populateItem(ListItem item) {
//                        item.add(new Label("title"));
//                        item.add(new Label("year"));
//                    }
//                };
//		PropertyListView movieListView = new PropertyListView("movie_list", movies) {
//			
//			private static final long serialVersionUID = 5745749838922549850L;
//
//			protected void populateItem(ListItem item) {
//				Movie movie = (Movie) item.getModelObject();
//				MovieDisplayPageLink movieLink = new MovieDisplayPageLink("movie_link", movie);
//				movieLink.add(new Label("title"));
//				movieLink.add(new Label("year"));
//				item.add(movieLink);
//			}
//		};
		this.add(movieListView);
	}
}