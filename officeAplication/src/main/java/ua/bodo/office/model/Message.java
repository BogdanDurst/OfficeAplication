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
@Table(name="Message")
public class Message {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="content")
	private String content;
	
	@Column(name="date", length=45)
	private String date;
	
	@ManyToOne
	@JoinColumn(name="Reciever_id")
	private User reciever;
	
	@ManyToOne
	@JoinColumn(name="Sender_id")
	private User sender;
	
	public Message(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setContent(String content){
		this.content = content;
	}
	public void setDate(String date){
		this.date = date;
	}
	public void setReciever(User reciever){
		this.reciever = reciever;
	}
	public void serSender(User sender){
		this.sender = sender;
	}
	public long getId(){
		return id;
	}
	public String getContent(){
		return content;
	}
	public String getDate(){
		return date;
	}
	public User gerReciever(){
		return reciever;
	}
	public User getSender(){
		return sender;
	}

}
