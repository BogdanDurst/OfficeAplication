package ua.bodo.office.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Role")
public class Role {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(name="name", length=45)
	private String name;
	
	
	public Role(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public long getId(){
		return id;
	}
	public String getName(){
		return name;
	}

}