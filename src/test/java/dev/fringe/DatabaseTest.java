package dev.fringe;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dev.fringe.config.HibernateConfig;
import dev.fringe.model.Movie;
import dev.fringe.repositories.MovieRepositories;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(classes = HibernateConfig.class)
public class DatabaseTest {
	
	@Autowired
    private MovieRepositories repositories;
    
	@Test
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void test() {
		System.out.println(repositories.save(new Movie("title1223231", 1023)));
		System.out.println(repositories.findAll());
	}

}
