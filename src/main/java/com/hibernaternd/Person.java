package com.hibernaternd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="person")
public class Person { 
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Id @GeneratedValue
    private long id;  
	@Column(name="name")
    private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
