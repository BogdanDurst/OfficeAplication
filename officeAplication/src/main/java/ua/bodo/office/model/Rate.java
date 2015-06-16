package ua.bodo.office.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Rate")
public class Rate {
	
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="value")
	private String value;
	
	@ManyToOne
	@JoinColumn(name="Role_id")
	private Role role;
	
	public Rate(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setValue(String value){
		this.value = value;
	}
	public void setRole(Role role){
		this.role = role;
	}
	public long getId(){
		return id;
	}
	public String getValue(){
		return value;
	}
	public Role getRole(){
		return role;
	}

}
