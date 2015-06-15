package ua.bodo.office.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Role_has_User")
public class RoleHasUser {
	
	
	@Column(name="Role_id")
	@ManyToOne
	@JoinColumn(name="Role_id")
	private Role role;
	
	@Column(name="User_id")
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	
	public RoleHasUser(){
		
	}
	
	public void setRoleId(Role role){
		this.role = role;
	}
	public void setUserId(User user){
		this.user = user;
	}
	public Role getRole(){
		return role;
	}
	public User getUser(){
		return user;
	}

}
