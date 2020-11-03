package dev.fringe.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories("dev.fringe.repositories")
@Configuration
public class HibernateConfig {
	 
	    @Bean
	    public DataSource dataSource() {
	        BasicDataSource dataSource = new BasicDataSource();
	        dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
	        dataSource.setUrl("jdbc:hsqldb:hsql://localhost/");
	        dataSource.setUsername("sa");
	        dataSource.setPassword("");
	        return dataSource;
	    }
	    
	    @Bean
	    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	        factory.setJpaVendorAdapter(vendorAdapter);
	        factory.setPackagesToScan("dev.fringe.model");
	        factory.setDataSource(dataSource());
	        factory.setJpaProperties(hibernateProperties());
	        return factory;
	    }

	    @Bean
	    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
	        JpaTransactionManager txManager = new JpaTransactionManager();
	        txManager.setEntityManagerFactory(entityManagerFactory);
	        return txManager;
	    }
	    
	    private final Properties hibernateProperties() {
	        Properties hibernateProperties = new Properties();
	        hibernateProperties.setProperty(
	          "hibernate.hbm2ddl.auto", "none");
	        hibernateProperties.setProperty(
	          "hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
	        hibernateProperties.setProperty(
	  	          "hibernate.show_sql", "true");
	        return hibernateProperties;
	    }
}
