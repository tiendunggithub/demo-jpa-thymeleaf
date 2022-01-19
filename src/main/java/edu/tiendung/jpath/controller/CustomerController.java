package edu.tiendung.jpath.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.tiendung.jpath.entity.Hobby;
import edu.tiendung.jpath.entity.Province;
import edu.tiendung.jpath.service.define.CustomerPageService;
import edu.tiendung.jpath.service.define.BaseService;
import edu.tiendung.jpath.entity.Customer;

@Controller
public class CustomerController {
	@Autowired
	private BaseService<Customer> customerService;
	
	@Autowired
	private BaseService<Province> provinceService;

	@Autowired
	private BaseService<Hobby> hobbyService;
	
	@Autowired
	private CustomerPageService customerPageService;
	
	@ModelAttribute("provinces")
	public List<Province> provinces() {
		return provinceService.getAll();
	}

	@ModelAttribute("hobbies")
	public List<Hobby> hobbies() {
		return hobbyService.getAll();
	}
	/*
	 * @GetMapping("/customers") public ModelAndView listCustomers() {
	 * List<Customer> customers = customerService.getAll(); ModelAndView
	 * modelAndView = new ModelAndView("/customer/list");
	 * modelAndView.addObject("customers", customers); return modelAndView; }
	 */
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		List<Customer> theCustomers = customerService.getAll();
		theModel.addAttribute("customers", theCustomers);
		return "/customer/list1";
	}
	
	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		// LOG.debug("inside show customer-form handler method");
		Customer theCustomer = new Customer();
		theModel.addAttribute("customer", theCustomer);
		return "customer/create";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
		customerService.save(theCustomer);
		return "redirect:/customer/list";
	}

	@GetMapping("/updateForm")
	public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel) {
		Customer theCustomer = customerService.getByID(theId);
		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerService.deleteById(theId);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/page")
	public String listCustomers(@RequestParam("s") Optional<String> s, Pageable pageable,  Model theModel) {
		Page<Customer> customers;
		if (s.isPresent()) {
			customers = customerPageService.findAllByFirstNameContaining(s.get(), pageable);
		} else {
			customers = customerPageService.findAll(pageable);
		}
		theModel.addAttribute("customers", customers);

		return "customer/list";
	}

}
