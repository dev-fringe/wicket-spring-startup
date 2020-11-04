package dev.fringe.web.support;

import java.util.Map;
import java.util.stream.Collectors;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.mapper.parameter.INamedParameters.NamedPair;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WicketUtil {

	public static PageParameters toPageParameters(Object object) {
		PageParameters pageParameters = new PageParameters();
		new ObjectMapper().convertValue(object, Map.class).forEach((k,v) -> {
			if(v != null) {//pageParameters Object를 null 넣으면 에러가 난다. --
				pageParameters.add((String)k, v);
			}
		});
		return pageParameters;
	}
	
	public static Map pageParametersToMap(PageParameters pageParameters) {
		return pageParameters.getAllNamed().stream().collect(Collectors.toMap(NamedPair::getKey, NamedPair::getValue));//getValue only String?? 
	}
}
