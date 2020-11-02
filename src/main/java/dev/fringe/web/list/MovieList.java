package dev.fringe.web.list;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.wicketstuff.annotation.mount.MountPath;
import org.wicketstuff.lambda.components.ComponentFactory;

import dev.fringe.model.Movie;
import dev.fringe.service.AppService;
import dev.fringe.web.common.PageFooter;
import dev.fringe.web.common.PageHeader;
import dev.fringe.web.list.link.MovieDisplayPage;

@MountPath(value = "/movie_list")
public class MovieList extends WebPage  {
	
	private static final long serialVersionUID = 6533160468170473434L;
	
	@SpringBean
	private AppService service;
	
	public MovieList() {
		this.add(new PageHeader("pageHeader"));
		this.add(new ListView<Movie>("movie_list", service.getMovies()) {
			private static final long serialVersionUID = 5745749838922549850L;
			protected void populateItem(ListItem<Movie> item) {
				Movie movie = item.getModelObject();
				item.add(new Label("title", movie.getTitle()));
				item.add(new Label("year", movie.getYear().toString()));
				item.add(ComponentFactory.link("linkToMovie", (c) -> {
					this.setResponsePage(new MovieDisplayPage(movie));
				}));				
            }
        });
		this.add(new PageFooter("pageFooter"));
	}
}