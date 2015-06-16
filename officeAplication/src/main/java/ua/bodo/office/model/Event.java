package ua.bodo.office.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Event")
public class Event {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="time_from", length=45)
	private String timeFrom;
	
	@Column(name="duration", length=45)
	private String duration;
	
	@ManyToOne
	@JoinColumn(name="Type_id")
	private Type type;
	
	@ManyToOne
	@JoinColumn(name="Schedule_id")
	private Schedule schedule;
	
	@Column(name="isComfirmed")
	private boolean isComfirmed;
	
	public Event(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setTimeFrom(String timeFrom){
		this.timeFrom = timeFrom;
	}
	public void setDuration(String duration){
		this.duration = duration;
	}
	public void setType(Type type){
		this.type = type;
	}
	public void setSchedule(Schedule schedule){
		this.schedule = schedule;
	}
	public void setIsComfirmed(boolean isComfirmed){
		this.isComfirmed = isComfirmed;
	}
	public long getId(){
		return id;
	}
	public String getTimeFrom(){
		return timeFrom;
	}
	public String getDuration(){
		return duration;
	}
	public Type getType(){
		return type;
	}
	public Schedule getSchedule(){
		return schedule;
	}
	public boolean getIsComfirmed(){
		return isComfirmed;
	}
	

}
