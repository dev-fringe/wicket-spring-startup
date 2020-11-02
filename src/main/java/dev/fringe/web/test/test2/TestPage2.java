package dev.fringe.web.test.test2;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath(value = "/test2", alt = { "/test2/${param1}", "/test2/${param1}/${param2}" })
public class TestPage2 extends WebPage {

	private static final long serialVersionUID = -29761277226568994L;

	public TestPage2(PageParameters params) {
		this.add(new Label("param1", params.get("param1").toString("unKnown.")));
		this.add(new Label("param2", params.get("param2").toString("unKnown.")));
	}

}