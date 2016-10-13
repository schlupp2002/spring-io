package io.spring.data.jpa.boot.repository;

import io.spring.data.jpa.boot.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;


/**
 * CustomerPagedRepository
 *
 * @author Steffen Bauer <schlupp2002@gmail.com>
 */
public interface CustomerPagedRepository extends PagingAndSortingRepository<Customer, Long> {

    Long countByLastName(String lastName);
}
