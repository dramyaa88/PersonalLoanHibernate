package demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class login implements Serializable{
	
	public login(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public login() {
		super();
	}

	@Id
	private String uname;
	private String password;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "login [uname=" + uname + ", password=" + password + "]";
	}
	
	
	
	

}
