
package dev.fringe.web.form;
import org.apache.wicket.feedback.ContainerFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.util.value.ValueMap;
import org.wicketstuff.annotation.mount.MountPath;

import dev.fringe.web.Index;

@MountPath(value = "feedback")
public class FeedbackPage extends WebPage {
	private static final long serialVersionUID = 2093836265163902699L;

	public FeedbackPage() {
		Form form = new Form("search") {
			private static final long serialVersionUID = 7362051644544448492L;
			protected void onSubmit() {
				System.out.println("Form was submitted using " + getMethod());
			}
		};
		add(form);
		form.add(new TextField("q", new Model("")));
		form = new Form("formPost") {
			private static final long serialVersionUID = -3707373539861753762L;
			protected void onSubmit() {
				System.out.println("Form was submitted using " + getMethod());
			}
		};
		add(form);
		form.add(new TextField("field", new Model("")));
		CompoundPropertyModel model = new CompoundPropertyModel(new ValueMap());
		form = new Form("form", model) {
			private static final long serialVersionUID = -5245072779995250008L;
			protected void onSubmit() {
				System.out.println(model);
				this.setResponsePage(new Index());
			}
		};
		add(form);
		form.add(new TextField("required", model.bind("value1")).setRequired(true));
		form.add(new TextField("integer", model.bind("value2"), Integer.class).setRequired(true));
		form.add(new TextField("mustbeone", model.bind("value3"), Integer.class).setRequired(true));

		form.add(new Label("value1"));
		form.add(new Label("value2"));
		form.add(new Label("value3"));

		form.add(new FeedbackPanel("feedback", new ContainerFeedbackMessageFilter(form)));
	}
}