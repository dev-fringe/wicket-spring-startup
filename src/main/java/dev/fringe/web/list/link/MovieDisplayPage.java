package dev.fringe.web.list.link;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;

import dev.fringe.model.Movie;
import dev.fringe.service.MovieService;
import dev.fringe.web.list.MovieList;
import dev.fringe.web.support.WicketUtil;

public class MovieDisplayPage extends WebPage {
	
	@SpringBean MovieService appService;
	
    public MovieDisplayPage(Movie movie) {
		Form<Movie> form = new Form<Movie>("form", new CompoundPropertyModel<Movie>(movie)) {
			protected void onSubmit() {
				appService.updateMovie((Movie)this.getModelObject());
				this.setResponsePage(new MovieList(WicketUtil.toPageParameters(this.getModelObject())));
			}
		};
		add(form);
		form.add(new TextField<String>("title"));
		form.add(new TextField<Integer>("year")); 
    }

}