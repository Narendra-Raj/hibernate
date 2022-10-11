package com.telusuko.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity()
@Table(name="alien_table")
public class Alien 
{
	@Id
private int aid;
	
private String aname;
@Column(name="alien_color")
private String acolor;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public String getAcolor() {
	return acolor;
}
public void setAcolor(String acolor) {
	this.acolor = acolor;
}


}
