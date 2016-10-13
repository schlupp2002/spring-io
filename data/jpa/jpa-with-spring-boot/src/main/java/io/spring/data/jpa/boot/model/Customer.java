package io.spring.data.jpa.boot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Customer
 *
 * @author Steffen Bauer <schlupp2002@gmail.com>
 */

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    private String egal;

    private Integer anzahl;


    protected Customer() {

    }


    public Customer(String firstName, String lastName, String egal, Integer anzahl) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.egal = egal;
        this.anzahl=anzahl;
    }


    @Override
    public String toString() {

        return String.format("%s[id=%d, firstName='%s', lastName='%s']", this.getClass(), id, firstName, lastName);
    }
}
