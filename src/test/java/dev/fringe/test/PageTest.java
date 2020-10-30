package dev.fringe.test;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;

public class PageTest extends WebPage {

	private static final long serialVersionUID = 1L;

	private String message = "[type your message to the world here]";

	public PageTest() {
		PropertyModel<String> messageModel = new PropertyModel<>(this, "message");
		add(new Label("msg", messageModel));
		Form<?> form = new Form<>("form");
		form.add(new TextField<>("field", messageModel));
		add(form);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
