package dev.fringe.web;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.ResourceModel;

import dev.fringe.web.common.PageFooter;
import dev.fringe.web.common.PageHeader;

public class HomePage extends WebPage {

	private static final long serialVersionUID = -1270338700310058141L;
	public HomePage() {
		add(new PageHeader("pageHeader"));
		add(new Label("friend", new ResourceModel("friend")));
		add(new PageFooter("pageFooter"));
	}

}
