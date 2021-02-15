package by.htp.accountBank.bean;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Bank implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<Customer> customers;
	private int element;

	public Bank() {
		customers = new ArrayList<Customer>();
	}

	public Bank(ArrayList<Customer> customers) {

		this.customers = customers;
		this.element = customers.size();
	}

	public int getElement() {
		return element;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomer(int index, Customer customer) {
		this.customers.set(index, customer);

	}

	public Customer getCustomer(int index) {
		return this.customers.get(index);
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
		element++;
	}

	public void addCustomerIndex(int index, Customer customer) {
		this.customers.add(index, customer);
		element++;
	}

}
