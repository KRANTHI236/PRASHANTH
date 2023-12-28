package com.session;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dto {
	@Id
	private int Eid;
	private String Ename;
	private int Eage;
	private int Esal;
	private long eno;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getEage() {
		return Eage;
	}

	public void setEage(int eage) {
		Eage = eage;
	}

	public int getEsal() {
		return Esal;
	}

	public void setEsal(int esal) {
		Esal = esal;
	}

	public long getEno() {
		return eno;
	}

	public void setEno(long eno) {
		this.eno = eno;
	}
}
