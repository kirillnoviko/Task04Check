package by.htp.accountBank.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.htp.accountBank.bean.Bank;
import by.htp.accountBank.bean.BankingAccount;
import by.htp.accountBank.bean.Customer;

public class BankLogic {

	private static List<BankingAccount> getAllAccountBank(List<Customer> customers) {

		List<BankingAccount> result = null;

		for (Customer cust : customers) {
			result.addAll(cust.getAccount());

		}
		return result;
	}

	public List<BankingAccount> sort(List<Customer> customers) {
		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();

		result = res.sort(result);

		return result;

	}

	public List<BankingAccount> sort(Customer customer) {

		List<BankingAccount> result = null;

		BankingAccountLogic res = new BankingAccountLogic();

		result = res.sort(result);

		return result;

	}

	public List<BankingAccount> searchBlockOrUnblock(Customer customer, boolean block) {
		List<BankingAccount> result = null;
		BankingAccountLogic res = new BankingAccountLogic();
		result = res.search(block, customer.getAccount());
		return result;
	}

	public List<BankingAccount> searchPositiveOrNegative(Customer customer, boolean positiveOrNegative) {
		List<BankingAccount> result = null;
		BankingAccountLogic res = new BankingAccountLogic();
		result = res.search(customer.getAccount(), positiveOrNegative);
		return result;
	}

	public List<BankingAccount> searchPositiveOrNegative(Customer customer, boolean positiveOrNegative, boolean block) {
		List<BankingAccount> result = null;
		BankingAccountLogic res = new BankingAccountLogic();
		result = res.search(customer.getAccount(), positiveOrNegative, block);
		return result;
	}

	public List<BankingAccount> searchBlockOrUnblock(List<Customer> customers, boolean block) {

		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();
		result = res.search(block, result);
		return result;
	}

	public List<BankingAccount> searchPositiveOrNegative(List<Customer> customers, boolean positiveOrNegative) {
		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();
		result = res.search(result, positiveOrNegative);
		return result;
	}

	public List<BankingAccount> searchPositiveOrNegative(List<Customer> customers, boolean positiveOrNegative,
			boolean block) {
		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();
		result = res.search(result, positiveOrNegative, block);
		return result;
	}

	public int sum(Customer customer) {

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(customer.getAccount());
	}

	public int sum(Customer customer, boolean block) {

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(customer.getAccount(), block);
	}

	public int sum(boolean positiveOrNegative, Customer customer) {

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(positiveOrNegative, customer.getAccount());
	}

	public int sum(Customer customer, boolean positiveOrNegative, boolean block) {
		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(customer.getAccount(), positiveOrNegative, block);
	}

	public int sum(List<Customer> customers) {

		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(result);
	}

	public int sum(List<Customer> customers, boolean block) {

		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(result, block);
	}

	public int sum(boolean positiveOrNegative, List<Customer> customers) {

		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(positiveOrNegative, result);
	}

	public int sum(List<Customer> customers, boolean positiveOrNegative, boolean block) {

		List<BankingAccount> result = null;

		result = getAllAccountBank(customers);

		BankingAccountLogic res = new BankingAccountLogic();

		return res.sumAmount(result, positiveOrNegative, block);
	}
}
