package edu.tiendung.jpath.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.tiendung.jpath.entity.Customer;
import edu.tiendung.jpath.repository.CustomerRepository;
import edu.tiendung.jpath.service.define.BaseService;

@Service
public class CustomerServiceImpl implements BaseService<Customer> {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getAll() {		
		return customerRepository.findAll();
	}

	@Override
	public void save(Customer object) {
		customerRepository.save(object);		
	}

	@Override
	public Customer getByID(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);		
	}
}
