package edu.tiendung.jpath.service.define;

import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;

import edu.tiendung.jpath.entity.Customer;
import edu.tiendung.jpath.entity.Province;

public interface CustomerPageService {
	
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}

