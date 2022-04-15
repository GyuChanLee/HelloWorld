package co.edu.app;

public class Account 
{
	private  String accountNum;
	private String accountName;
	private int balance = 0;
	
	
	// 생성자 : 
	public Account() {}
	
	Account(String accountNum, String accountName, int balance)
	{
		this.accountNum = accountNum;
		this.accountName = accountName;
		this.balance = balance;
	}


	// getter / setter.
	public String getAccountNum() {
		return accountNum;
	}


	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public boolean plusBalance(int balance) {
		boolean ok = true;
		this.balance += balance;
		return ok;
	}
	
	public boolean minusBalance(int balance) {
		boolean ok = true;
		this.balance -= balance;
		return ok;
	}
}
