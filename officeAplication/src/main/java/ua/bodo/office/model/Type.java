package ua.bodo.office.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Type")
public class Type {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="name", length=45)
	private String name;
	
	@Column(name="isPersonal")
	private boolean isPersonal;
	
	public Type(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setIsPersonal(boolean isPersonal){
		this.isPersonal = isPersonal;
	}
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public boolean getIsPersonal(){
		return isPersonal;
	}
	

}
