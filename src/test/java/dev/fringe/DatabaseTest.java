package dev.fringe;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dev.fringe.config.HibernateConfig;
import dev.fringe.model.Movie;
import dev.fringe.repositories.MovieRepositories;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = HibernateConfig.class)
@EnableAutoConfiguration
public class DatabaseTest {
	
	@Autowired
    private MovieRepositories repositories;
    
	@Test
	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public void test() {
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		repositories.save(new Movie("The Seven Samurai", 2014));
		repositories.save(new Movie("Bonnie and Clyde", 1967));
		repositories.save(new Movie("Reservoir Dogs", 1992));
		repositories.save(new Movie("Airplane!", 1980));
		repositories.save(new Movie("Doctor Zhivago", 1965));
		repositories.save(new Movie("The Deer Hunter", 1978	));
		repositories.save(new Movie("Close Encounters of the Third Kind", 1977));
		repositories.save(new Movie("Up", 2009));
		System.out.println(repositories.findAll());
	}

}
