package com.encrypt.encryptTran.model;
public class Transaction {

	private String accountNumber;
	private String type;
	private String amount;
	private String currency;
	private String accountFrom;
	
	public Transaction() {
		super();
	}

	public Transaction(String accountNumber, String type, String amount, String currency, String accountFrom) {
		super();
		this.accountNumber = accountNumber;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.accountFrom = accountFrom;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(String accountFrom) {
		this.accountFrom = accountFrom;
	}

	@Override
	public String toString() {
		return "Transaction [accountNumber=" + accountNumber + ", type=" + type + ", amount=" + amount + ", currency="
				+ currency + ", accountFrom=" + accountFrom + "]";
	}
	
}
