package io.spring.data.jpa.boot.repository;

import io.spring.data.jpa.boot.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * CustomerRepository
 *
 * @author Steffen Bauer <schlupp2002@gmail.com>
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    Customer findByEgal(String egal);

    List<Customer> findByAnzahl(Integer anzahl);
}
