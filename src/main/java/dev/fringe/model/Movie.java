package dev.fringe.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movie")
public class Movie implements Serializable{

	private static final long serialVersionUID = 1487349209539955679L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private Integer year;
	
	public Movie(String title, Integer year) {
		super();
		this.title = title;
		this.year = year;
	}
	

}