package dev.fringe;

import org.apache.wicket.Page;
import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.fringe.web.HomePage;

public class WicketWebConfig extends WebApplication {

    protected void init() {
        super.init();
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, new AnnotationConfigApplicationContext(App.class.getPackageName())));
		setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this));
    }

    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }


}
