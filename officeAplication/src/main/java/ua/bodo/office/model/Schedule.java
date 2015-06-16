package ua.bodo.office.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Schedule")
public class Schedule {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", length=45)
	private String name;
	
	@Column(name="date")
	@Temporal(value=TemporalType.DATE)
	private Date date;
	
	public Schedule(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDate(Date date){
		this.date = date;
	}
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public Date getDate(){
		return date;
	}

}
