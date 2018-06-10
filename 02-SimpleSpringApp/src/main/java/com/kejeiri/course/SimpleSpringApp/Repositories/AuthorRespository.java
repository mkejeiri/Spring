package com.kejeiri.course.SimpleSpringApp.Repositories;

import com.kejeiri.course.SimpleSpringApp.model.Author;
import org.springframework.data.repository.CrudRepository ;

public interface AuthorRespository extends CrudRepository <Author,Long>{
}
