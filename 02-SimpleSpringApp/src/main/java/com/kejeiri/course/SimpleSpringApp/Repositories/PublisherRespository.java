package com.kejeiri.course.SimpleSpringApp.Repositories;

import com.kejeiri.course.SimpleSpringApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;
public interface PublisherRespository  extends CrudRepository<Publisher,Long> {
}
