package com.kejeiri.course.SimpleSpringApp.Repositories;

import com.kejeiri.course.SimpleSpringApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespository extends CrudRepository<Book,Long> {
}
      