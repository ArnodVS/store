package com.avs.store.customer.services;

import com.avs.store.customer.repository.entity.Customer;
import com.avs.store.customer.repository.entity.Region;

import java.util.List;

public interface CustomerService {

    List<Customer> findCustomerAll();

    List<Customer> findCustomersByRegion(Region region);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    Customer deleteCustomer(Customer customer);

    Customer getCustomer(Long id);

}