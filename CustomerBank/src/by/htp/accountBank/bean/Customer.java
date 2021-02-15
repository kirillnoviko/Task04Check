package by.htp.accountBank.bean;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private String surname;
	private String firstName;
	private String middleName;
	private String addres;
	private int id;
	private List<BankingAccount> account;

	public Customer(String surname, String firstName, String middleName, String addres, int id,
			List<BankingAccount> account) {
		super();
		this.surname = surname;
		this.firstName = firstName;
		this.middleName = middleName;
		this.addres = addres;
		this.id = id;
		this.account = account;
	}

	public Customer() {

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMinddleName() {
		return middleName;
	}

	public void setMinddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<BankingAccount> getAccount() {
		return account;
	}

	public void setAccount(List<BankingAccount> account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((addres == null) ? 0 : addres.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Customer other = (Customer) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (addres == null) {
			if (other.addres != null)
				return false;
		} else if (!addres.equals(other.addres))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [surname=" + surname + ", firstName=" + firstName + ", middleName=" + middleName + ", addres="
				+ addres + ", id=" + id + ", account=" + account + "]";
	}

}
