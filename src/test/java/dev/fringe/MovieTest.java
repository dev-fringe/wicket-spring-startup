package dev.fringe;

import org.apache.wicket.util.tester.WicketTester;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import dev.fringe.config.WicketWebConfig;
import dev.fringe.web.list.MovieList;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
public class MovieTest {
	
    private WicketTester tester;

    @Autowired WicketWebConfig myWebApplication;

    @Before
    public void setUp() {
        tester = new WicketTester(myWebApplication);
    }
    
	@Test
	public void test() {
		tester.startPage(MovieList.class);
		tester.assertRenderedPage(MovieList.class);
        String html = tester.getLastResponse().getDocument();
        Document doc = Jsoup.parse(html);
        System.out.println(doc.body().toString());
	}

}
