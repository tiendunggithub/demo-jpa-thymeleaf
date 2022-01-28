package edu.tiendung.jpath.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@ManyToOne
    @JoinColumn(name = "province_id")
    private Province province;
	
	
	/*
	 * @ManyToMany(fetch=FetchType.EAGER)
	 * 
	 * @JoinTable(name = "customers_hobbies", joinColumns = @JoinColumn(name =
	 * "customer_id"), inverseJoinColumns = @JoinColumn(name = "hobby_id") ) private
	 * List<Hobby> hobbies = new ArrayList();
	 */

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}
	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}
	
	/*
	 * public List<Hobby> getHobbies() { return hobbies; }
	 * 
	 * public void setHobbies(List<Hobby> hobbies) { this.hobbies = hobbies; }
	 */
}
