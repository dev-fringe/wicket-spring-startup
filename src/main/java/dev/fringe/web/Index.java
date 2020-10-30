package dev.fringe.web;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;

//@MountPath(value = "index")
public class Index extends WebPage {
	private static final long serialVersionUID = 3242121993137955865L;

	private int counter;

	private int ajaxCounter;

	private Label label;

	private String message = "[type your message to the world here]";
	
	public Index() {
		add(new Label("message", "Hello, World!"));
		add(new Link<>("link") {
			private static final long serialVersionUID = 794951760814654676L;
			public void onClick() {
				counter++;
			}
		});
		add(new Label("label", new PropertyModel<Object>(this, "counter")));
		add(new AjaxLink<Void>("ajaxlink") {
			private static final long serialVersionUID = 6065587442836993546L;
			public void onClick(AjaxRequestTarget target) {
				ajaxCounter++;
				if (target != null) {
					target.add(label);
				}
			}
		});

		add(label = new Label("ajaxlabel", new PropertyModel<Object>(this, "ajaxCounter")));
		label.setOutputMarkupId(true);
		Form<Object> form = new Form<Object>("form");
		final TextField<String> field = new TextField<String>("field", new PropertyModel<>(this, "message"));
	    final Label label = new Label("echo", new PropertyModel<>(this, "message"));
		form.add(field);
		add(form);
		add(label);
	}
}
