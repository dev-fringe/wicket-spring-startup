package dev.fringe;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

/**
 * @author dashorst
 */
public class Index extends WebPage {
  private int counter;

  private int ajaxCounter;

  private Label label;

	private String message = "[type your message to the world here]";
	
  public Index() {
    add(new Label("message", "Hello, World!"));
    add(new Link<>("link") {
      public void onClick() {
        counter++;
      }
    });
    add(new Label("label", new PropertyModel(this, "counter")));
    add(new AjaxLink<Void>("ajaxlink") {
      public void onClick(AjaxRequestTarget target) {
        ajaxCounter++;
        if (target != null) {
          target.add(label);
        }
      }
    });

    add(label = new Label("ajaxlabel", new PropertyModel(this,
        "ajaxCounter")));
    label.setOutputMarkupId(true);

    Form form = new Form("form");
    final TextField field = new TextField("field", new PropertyModel<>(this, "message"));
    final Label label = new Label("echo", new PropertyModel<>(this, "message"));
    form.add(field);
    add(form);
    add(label);

  }
}
