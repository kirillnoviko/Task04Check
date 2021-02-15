package by.htp.accountBank.bean;

import java.io.Serializable;

public class BankingAccount implements Serializable {

	private static final long serialVersionUID = 1L;
	private int idAccount;
	private int amount;
	private String currency;
	private boolean blocking;

	public BankingAccount() {

	}

	public BankingAccount(int idAccount, int amount, String currency, boolean blocking) {

		this.idAccount = idAccount;
		this.amount = amount;
		this.currency = currency;
		this.blocking = blocking;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isBlocking() {
		return blocking;
	}

	public void setBlocking(boolean blocking) {
		this.blocking = blocking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + (blocking ? 1231 : 1237);
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + idAccount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankingAccount other = (BankingAccount) obj;
		if (amount != other.amount)
			return false;
		if (blocking != other.blocking)
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (idAccount != other.idAccount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankingAccount [idAccount=" + idAccount + ", amount=" + amount + ", currency=" + currency
				+ ", blocking=" + blocking + "]";
	}

}
