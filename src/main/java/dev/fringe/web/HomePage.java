package dev.fringe.web;

import java.util.Locale;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.extensions.ajax.markup.html.modal.ModalDialog;
import org.apache.wicket.extensions.ajax.markup.html.modal.theme.DefaultTheme;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;

import dev.fringe.web.service.AppService;

public class HomePage extends WebPage {

	private static final long serialVersionUID = -1270338700310058141L;

	@SpringBean
	AppService appService;
	
	public HomePage(final PageParameters parameters) {
//		add(new DebugBar("debug"));
		this.getSession().setLocale(Locale.KOREAN);
		this.getSession().setLocale(Locale.ENGLISH);
		appService.print();
		add(new Label("friend", new ResourceModel("friend")));
		final ModalDialog modal = new ModalDialog("modal");
		modal.add(new DefaultTheme());
		modal.closeOnClick();
		Label label = new Label(ModalDialog.CONTENT_ID, new ResourceModel("terms_of_use"));
		modal.setContent(label);
		add(modal);
		add(new AjaxLink<Void>("open") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				modal.open(target);
			}
		});
		add(new AjaxLink<Void>("change") {
			@Override
			public void onClick(AjaxRequestTarget target) {
				this.getSession().setLocale(Locale.KOREAN);
			}
		});		
	}

}