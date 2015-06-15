package ua.bodo.office.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Salary")
public class Salary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long id;
	
	@Column(name="value")
	private int value;
	
	@Column(name="date")
	@Temporal(value=TemporalType.DATE)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Salary(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setValue(int value){
		this.value = value;
	}
	public void setDate (Date date){
		this.date = date;
	}
	public void setUser(User user){
		this.user = user;
	}
	public long getId(){
		return id;
	}
	public int getValue(){
		return value;
	}
	public Date getDate(){
		return date;
	}
	public User getUser(){
		return user;
	}

}
