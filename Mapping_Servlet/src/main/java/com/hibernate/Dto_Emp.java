package com.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dto_Emp {
	@Id
	private int eid;
	private String ename;
	private long empnum;
	@javax.persistence.ManyToOne
	private Dto_Dept d;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public long getEmpnum() {
		return empnum;
	}

	public void setEmpnum(long empnum) {
		this.empnum = empnum;
	}

	public Dto_Dept getD() {
		return d;
	}

	public void setD(Dto_Dept d) {
		this.d = d;
	}

}
