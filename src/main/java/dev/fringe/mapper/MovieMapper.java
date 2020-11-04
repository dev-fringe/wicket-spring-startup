package dev.fringe.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import dev.fringe.model.Movie;

public interface MovieMapper {
	
	@Select("""
		SELECT
			  ID
			, TITLE
			, YEAR 
		FROM
			MOVIE 
		WHERE 1=1
		  AND TITLE = #{title}
			""")
	List<Movie> select(Map<String, Object> map);
}
