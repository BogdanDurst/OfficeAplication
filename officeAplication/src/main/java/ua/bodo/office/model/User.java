package ua.bodo.office.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="first_name", length=45)
	private String firstName;
	
	@Column(name="last_name", length=45)
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="email", length=45, unique=true, nullable=false)
	private String email;
	
	@Column(name="password", length=45, nullable=false)
	private String password;
	
	public User(){
	
	}
	
	
	public void setId(long id){
		this.id = id;
	}	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void  setEmail(String email){
		this.email = email;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public long getId(){
		return id;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getAge(){
		return age;
	}
	public String getEmail(){
		return email;
	}
	public String getPassword(){
		return password;
	}

}
