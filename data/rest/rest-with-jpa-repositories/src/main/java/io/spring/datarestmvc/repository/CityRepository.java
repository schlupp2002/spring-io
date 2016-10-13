package io.spring.datarestmvc.repository;

import io.spring.datarestmvc.model.City;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


/**
 * CityRepository
 *
 * @author Steffen Bauer <schlupp2002@gmail.com>
 */

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRepository extends PagingAndSortingRepository<City, Long> {

    List<City> findByCountrycode(@Param("cc") String cc);
}
