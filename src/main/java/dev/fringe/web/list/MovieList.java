package dev.fringe.web.list;

import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PageableListView;
import org.apache.wicket.markup.html.navigation.paging.PagingNavigator;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.wicketstuff.annotation.mount.MountPath;
import org.wicketstuff.lambda.components.ComponentFactory;

import dev.fringe.model.Movie;
import dev.fringe.service.MovieService;
import dev.fringe.web.list.link.MovieDisplayPage;
import dev.fringe.web.support.WicketUtil;

@MountPath(value = "/movie_list")
public class MovieList extends WebPage {
	
	@SpringBean MovieService movieService;

	public MovieList(PageParameters params) {
		CompoundPropertyModel model = new CompoundPropertyModel<>(new Movie());
		Form form = new Form("search", model) {
			protected void onSubmit() {
				setResponsePage(new MovieList(WicketUtil.toPageParameters(this.getModelObject()))); // search 자기 클래스를  부른다
			}
		};
		add(form);
		form.add(new TextField("title", model.bind("title")));//.setRequired(true));
		form.add(new FeedbackPanel("feedback", new ContainerFeedbackMessageFilter(form)));
		PageableListView<Movie> listView = new PageableListView<Movie>("list", movieService.getMovies(params), 15) {
			protected void populateItem(ListItem<Movie> item) {
				item.add(new Label("title", new PropertyModel(item.getModel(), "title")));
				item.add(new Label("year", new PropertyModel(item.getModel(), "year")));
				item.add(ComponentFactory.link("link",(c) -> this.setResponsePage(new MovieDisplayPage(item.getModelObject())))); // redirect
			}
		};
		add(listView);
		add(new PagingNavigator("navigator", listView));//페이징
	}
}