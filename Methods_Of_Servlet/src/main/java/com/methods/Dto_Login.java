package com.methods;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dto_Login {
	@Id
	private Long phno;
	private String pwd;

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
