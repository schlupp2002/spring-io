package io.spring.data.jpa;

import io.spring.data.jpa.boot.model.Customer;
import io.spring.data.jpa.boot.repository.CustomerPagedRepository;
import io.spring.data.jpa.boot.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;


/**
 * Application
 *
 * @author Steffen Bauer <schlupp2002@gmail.com>
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class);
    }


    @Bean
    public CommandLineRunner demo(CustomerRepository repo, CustomerPagedRepository pagedRepo) {

        return (args) -> {

            //region Beispieldaten bereitstellen
            repo.save(new Customer("Jack", "Bauer", "alpha", 100));
            repo.save(new Customer("Jack", "Wolfskin", "bravo", 200));
            repo.save(new Customer("AJackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("BJackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("CJackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("DJackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("EJackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("AAJackCopy", "Wolfskin", "bravo", 210));
            repo.save(new Customer("ADAJackCopy", "Wolfskin", "bravo", 220));
            repo.save(new Customer("ABCJackCopy", "Wolfskin", "bravo", 230));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 240));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 250));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 260));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 270));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 280));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 290));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 201));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 202));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 203));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 204));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 205));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 206));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 207));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 208));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 209));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 211));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 212));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 213));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 214));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 215));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 216));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("JackCopy", "Wolfskin", "bravo", 200));
            repo.save(new Customer("Kim", "Bauer", "charly", 300));
            repo.save(new Customer("David", "Palmer", "delta", 400));
            repo.save(new Customer("Michelle", "Dressler", "ecko", 500));
            //endregion

            //region Test des CrudRepository<Customer, Long>
            System.out.println();
            System.out.println("findAll()");
            System.out.println("---------------------------------------------------------------------------------");
            for (Customer c : repo.findAll()) {
                System.out.println(c);
            }

            System.out.println();
            System.out.println("findOne()");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(repo.findOne(1L));

            System.out.println();
            System.out.println("findByLastName('Bauer')");
            System.out.println("---------------------------------------------------------------------------------");
            for (Customer c : repo.findByLastName("Bauer")) {
                System.out.println(c);
            }

            System.out.println();
            System.out.println("findByEgal('alpha')");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(repo.findByEgal("alpha"));

            System.out.println();
            System.out.println("findByAnzahl(200)");
            System.out.println("---------------------------------------------------------------------------------");
            for (Customer c : repo.findByAnzahl(200))
                System.out.println(c);

            System.out.println();
            System.out.println("count");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(repo.count());
            //endregion

            System.out.println();
            System.out.println("paged and sorted (returns the first page with 3 data rows)");
            System.out.println("---------------------------------------------------------------------------------");
            for (Customer c : pagedRepo.findAll(new PageRequest(0, 3)))
                System.out.println(c);

            System.out.println();
            System.out.println("countByLastName('Bauer') -> 2");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(pagedRepo.countByLastName("Bauer"));

            System.out.println();
            System.out.println("countByLastName('Wolfskin') -> 33");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(pagedRepo.countByLastName("Wolfskin"));
        };
    }
}