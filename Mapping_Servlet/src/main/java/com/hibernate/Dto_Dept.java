package com.hibernate;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dto_Dept {
	@Id
	private int did;
	private String dname;
	private String loc;
	@javax.persistence.OneToMany
	private List<Dto_Emp> d1;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public List<Dto_Emp> getD1() {
		return d1;
	}

	public void setD1(List<Dto_Emp> d1) {
		this.d1 = d1;
	}

}
