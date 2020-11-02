package dev.fringe.config;

import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wicketstuff.annotation.scan.AnnotatedMountScanner;

import dev.fringe.App;
import dev.fringe.web.HomePage;
import dev.fringe.web.Index;

public class WicketWebConfig extends WebApplication {

    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, new AnnotationConfigApplicationContext(App.class.getPackageName())));
		setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this));
		new AnnotatedMountScanner().scanPackage("dev.fringe.web").mount(this);
		mountPage("/index",Index.class);
    }

    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

	@Override
	public RuntimeConfigurationType getConfigurationType() {
		return RuntimeConfigurationType.DEVELOPMENT;
	}

}
