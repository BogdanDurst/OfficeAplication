package ua.bodo.office.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Event_has_User")
public class EventHasUser {
	
	@ManyToOne
	@JoinColumn(name="Event_id")
	private Event event;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	
	public EventHasUser(){
		
	}
	public void setEvent(Event event){
		this.event = event;
	}
	public void setUser(User user){
		this.user = user;
	}
	public Event getEvent(){
		return event;
	}
	public User getUser(){
		return user;
	}

}
