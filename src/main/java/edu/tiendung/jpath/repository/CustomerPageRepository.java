package edu.tiendung.jpath.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;


import edu.tiendung.jpath.entity.Customer;
import edu.tiendung.jpath.entity.Province;


public interface CustomerPageRepository extends PagingAndSortingRepository<Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, org.springframework.data.domain.Pageable pageable);
}

