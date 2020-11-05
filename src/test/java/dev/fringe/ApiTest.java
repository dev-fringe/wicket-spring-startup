package dev.fringe;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.kazuki43zoo.jpetstore.domain.Item;

import dev.fringe.config.HibernateConfig;
import dev.fringe.config.RestConfig;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {HibernateConfig.class, RestConfig.class})
@EnableAutoConfiguration
public class ApiTest {
	
	@Autowired
    private RestTemplate restTemplate;
    
	@Test
	public void test() {
		System.out.println(restTemplate.getForObject("http://localhost:8000/store/api/catalog/items/EST-18", Item.class));
	}

}
