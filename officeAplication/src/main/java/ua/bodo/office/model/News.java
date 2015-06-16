package ua.bodo.office.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="News")
public class News {
	
	@Id
	@Column(name="idNews")
	private long id;
	
	@Column(name="content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private User user;
	
	public News(){
		
	}
	
	public void setId(long id){
		this.id = id;
	}
	public void setContent(String content){
		this.content = content;
	}
	public void setUser(User user){
		this.user = user;
	}
	public long getId(){
		return id;
	}
	public String getContent(){
		return content;
	}
	public User getUser(){
		return user;
	}

}
