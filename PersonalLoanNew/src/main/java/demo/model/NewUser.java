package demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "newUser")
public class NewUser {
	private String name;
	@Id
	private String userId;
	private String password;
	private String country;
	private String mobileNumber;
	private String panNumber;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMobileNumber() {
		
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	@Override
	public String toString() {
		return "NewUser [name=" + name + ", userId=" + userId + ", password=" + password + ", country=" + country
				+ ", mobileNumber=" + mobileNumber + ", panNumber=" + panNumber + "]";
	}
	public NewUser(String name, String userId, String password, String country, String mobileNumber, String panNumber
			) {
		super();
		this.name = name;
		this.userId = userId;
		this.password = password;
		this.country = country;
		this.mobileNumber = mobileNumber;
		this.panNumber = panNumber;
		
	}
	public NewUser() {
		super();
	}
	public NewUser(String uname,String mobileNumber) {
		// TODO Auto-generated constructor stub
		this.userId = uname;
		this.mobileNumber = mobileNumber;
	}
	public NewUser(String id) {
		// TODO Auto-generated constructor stub
		this.userId = id;
	}
	
	
	
}
