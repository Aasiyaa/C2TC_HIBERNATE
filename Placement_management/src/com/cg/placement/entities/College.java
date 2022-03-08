package com.cg.placement.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="college")
public class College {
	@Id
	private int id;
	private String clgadmin;
	private String clgname;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClgadmin() {
		return clgadmin;
	}
	public void setClgadmin(String clgadmin) {
		this.clgadmin = clgadmin;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public College() {
		super();
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", clgadmin=" + clgadmin + ", clgname=" + clgname + ", location=" + location + "]";
	}
}
	
	
	