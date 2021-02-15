package by.htp.accountBank.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import by.htp.accountBank.bean.BankingAccount;
import by.htp.accountBank.bean.Customer;

public class BankingAccountLogic {

	public int sumAmount(List<BankingAccount> account, boolean blocking) {
		int count = 0;

		for (BankingAccount currentAccount : account) {

			if (currentAccount.isBlocking() == blocking) {

				count = count + currentAccount.getAmount();
			}

		}
		return count;
	}

	public int sumAmount(List<BankingAccount> account, boolean blocking, boolean positiveOrNegative) {
		int count = 0;

		if (positiveOrNegative) {

			for (BankingAccount currentAccount : account) {

				if (currentAccount.isBlocking() == blocking && currentAccount.getAmount() >= 0) {

					count = count + currentAccount.getAmount();
				}

			}

		} else {
			for (BankingAccount currentAccount : account) {

				if (currentAccount.isBlocking() == blocking && currentAccount.getAmount() < 0) {

					count = count + currentAccount.getAmount();
				}

			}
		}

		return count;
	}

	public int sumAmount(List<BankingAccount> account) {

		int count = 0;

		for (BankingAccount currentAccount : account) {

			count = count + currentAccount.getAmount();

		}

		return count;
	}

	public int sumAmount(boolean positiveOrNegative, List<BankingAccount> account) {

		int count = 0;
		if (positiveOrNegative) {
			for (BankingAccount currentAccount : account) {
				if (currentAccount.getAmount() >= 0) {
					count = count + currentAccount.getAmount();
				}

			}
		} else {
			for (BankingAccount currentAccount : account) {
				if (currentAccount.getAmount() < 0) {
					count = count + currentAccount.getAmount();
				}

			}
		}

		return count;
	}

	public boolean bloking(boolean blocking, int numberAccount, Customer customer) {

		int number = 0;
		for (BankingAccount currentAccount : customer.getAccount()) {
			number = currentAccount.getIdAccount();
			if (number == numberAccount) {
				currentAccount.setBlocking(blocking);
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

	public List<BankingAccount> search(List<BankingAccount> account, boolean positiveOrNegative) {

		List<BankingAccount> result = null;

		for (BankingAccount current : account) {
			if (positiveOrNegative) {
				if (current.getAmount() >= 0) {
					result.add(current);
				}
			} else {
				if (current.getAmount() < 0) {
					result.add(current);
				}
			}
		}

		return result;
	}

	public List<BankingAccount> search(boolean block, List<BankingAccount> account) {

		List<BankingAccount> result = null;

		for (BankingAccount current : account) {

			if (current.isBlocking() == block) {
				result.add(current);
			}

		}

		return result;
	}

	public List<BankingAccount> search(List<BankingAccount> account, boolean positiveOrNegative, boolean block) {

		List<BankingAccount> result = null;

		for (BankingAccount current : account) {
			if (positiveOrNegative) {
				if (current.isBlocking() == block) {
					result.add(current);
				}
			} else {
				if (current.isBlocking() == block) {
					result.add(current);
				}
			}
		}

		return result;
	}

	public List<BankingAccount> search(List<BankingAccount> account, int number) {

		List<BankingAccount> result = null;

		for (BankingAccount current : account) {

			if (current.getIdAccount() == number) {
				result.add(current);
			}

		}

		return result;
	}

	public List<BankingAccount> sort(List<BankingAccount> account) {

		boolean iterator = true;
		int count = 0;
		while (iterator) {
			iterator = false;
			count = 0;
			for (BankingAccount current : account) {

				if (count != 0 && current.getAmount() < account.get(count).getAmount()) {
					swap(account, count, count - 1);
				}
				count++;
			}
		}

		return account;
	}

	private static void swap(List<BankingAccount> account, int index, int index2) {

		BankingAccount temp = account.get(index);

		account.add(index, account.get(index2));
		account.add(index2, temp);

	}
}
