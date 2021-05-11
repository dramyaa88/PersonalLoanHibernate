package demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loanDetails")
public class loanDetails {
	@Id
	private String uname;
	private int monthlySalary;
	private int expense;
	private int loanAmount;
	private int tenure;
	
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	@Override
	public String toString() {
		return "loanDetails [uname=" + uname + ", monthlySalary=" + monthlySalary + ", expense=" + expense
				+ ", loanAmount=" + loanAmount + ", tenure=" + tenure + "]";
	}
	public loanDetails(String uname, int monthlySalary, int expense, int loanAmount, int tenure) {
		super();
		this.uname = uname;
		this.monthlySalary = monthlySalary;
		this.expense = expense;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public loanDetails() {
		super();
	}
	public loanDetails(int monthlySalary, int expense, int loanAmount, int tenure) {
		
		this.monthlySalary = monthlySalary;
		this.expense = expense;
		this.loanAmount = loanAmount;
		this.tenure = tenure;
	}
	public loanDetails(String userId) {
		// TODO Auto-generated constructor stub
		this.uname = userId;
	}
	
	
	
	

}
