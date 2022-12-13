package com.devsuperior.uri2611.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2611.dto.MovieMinDTO;
import com.devsuperior.uri2611.entities.Movie;
import com.devsuperior.uri2611.projections.MovieMinProjection;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	//SQL Raiz
	@Query(nativeQuery = true, value = " SELECT movies.id, movies.name "
			+ "  FROM movies "
			+ "  INNER JOIN genres on movies.id_genres = genres.id "
			+ "  WHERE genres.description = :genrename")
	List<MovieMinProjection> search1(String genrename);
	
	//JPQL
	@Query(" SELECT new com.devsuperior.uri2611.dto.MovieMinDTO(obj.id, obj.name) "
			+ "  FROM Movie obj "
			+ "  WHERE obj.genre.description = :genrename")
	List<MovieMinDTO> search2(String genrename);

}
