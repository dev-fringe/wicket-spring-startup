package dev.fringe.web;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.wicket.ajax.AjaxSelfUpdatingTimerBehavior;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.IModel;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("timer")
public class timer extends WebPage {
    private static final long serialVersionUID = -1379874346623832800L;
    public timer(){
        IModel<String> timerModel = new IModel<String>(){
            private static final long serialVersionUID = -1569609713265045874L;
            public String getObject(){
                return new SimpleDateFormat("HH:mm:ss").format(new Date());
            }
        };
        Label label = new Label("timer", timerModel);
        label.add(new AjaxSelfUpdatingTimerBehavior(Duration.ofSeconds(1)));
        add(label);
    }
}