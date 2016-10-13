package io.spring.data.jpa.mvc.repository;

import io.spring.data.jpa.mvc.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * CityRepository
 *
 * @author Steffen Bauer <schlupp2002@gmail.com>
 */

public interface CityRepository extends PagingAndSortingRepository<City, Long> {

    /*
        http://docs.spring.io/spring-data/jpa/docs/1.10.3.RELEASE/reference/html/#jpa.query-methods
     */
}
