package dev.fringe.web.test;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;

import dev.fringe.web.test.test2.TestPage2;

@MountPath(value = "/test", alt = { "/test/${param1}", "/test/${param1}/${param2}" })
public class TestPage extends WebPage {

	private static final long serialVersionUID = -29761277226568994L;

	public TestPage(PageParameters params) {
		this.add(new Label("param1", params.get("param1").toString("unKnown.")));
		this.add(new Label("param2", params.get("param2").toString("unKnown.")));
		add(new Link<>("link") {
			private static final long serialVersionUID = 794951760814654676L;
			public void onClick() {
				PageParameters pageParameters = new PageParameters();
				pageParameters.set(0, "foo");
				pageParameters.set(1, "bar");
				pageParameters.add("baz", "baz");
				setResponsePage(TestPage2.class, pageParameters);
			}
		});
	}

}