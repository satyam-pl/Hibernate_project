package com.entities;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SaveNoteServlet {
	
	@Id
	private int id;
	private String title;
	@Column(length=1500)
	private String content;
	private Date addDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
	public SaveNoteServlet(int id, String title, String content, Date addDate) {
		super();
		this.id = new Random().nextInt(1000);
		this.title = title;
		this.content = content;
		this.addDate = addDate;
	}
	public SaveNoteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
