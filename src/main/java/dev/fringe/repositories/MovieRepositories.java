package dev.fringe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.fringe.model.Movie;

public interface MovieRepositories extends JpaRepository<Movie, Long> {}
