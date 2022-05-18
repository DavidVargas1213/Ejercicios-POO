import java.util.Date;

public class Account {
	
	private int id = 0 ;
	private double balance =0;
	private double annualInterestRate = 0;
	private Date dataCreated;
	
	public Account() {
		
	}
	public Account(int id , double initialBalance) {
		this.id = id;
		this.balance = initialBalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDataCreated() {
		return dataCreated;
	}
	
	public void getMonthlyInterestRate() {
		
	}
}
