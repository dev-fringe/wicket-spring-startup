package dev.fringe;

import org.apache.wicket.util.tester.FormTester;
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

import dev.fringe.web.HomePage;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureRestDocs
public class AppTest {
	
    private WicketTester tester;

    @Autowired WicketWebConfig myWebApplication;

    @Before
    public void setUp() {
        tester = new WicketTester(myWebApplication);
    }
    
	@Test
	public void test() {
		tester.startPage(HomePage.class);
		tester.assertRenderedPage(HomePage.class);
        FormTester formTester = tester.newFormTester("form");
        formTester.setValue("msgInput", "안녕하세요. 이학도님");
        formTester.submit();
        String html = tester.getLastResponse().getDocument();
        Document doc = Jsoup.parse(html);
        System.out.println(doc.body().toString());
	}

}
