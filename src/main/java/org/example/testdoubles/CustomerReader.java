package org.example.testdoubles;

import org.example.testdoubles.utils.EntityManager;

public class CustomerReader {

    private EntityManager entityManager;

    public CustomerReader(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    public String findFullName(Long customerID) {
        Customer customer = entityManager.find(customerID);
        if (customer == null)
            return "";
        return customer.getFirstName() + " " + customer.getLastName();
    }
}
