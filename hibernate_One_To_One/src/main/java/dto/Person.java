package dto;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int personId;
private String personName;
private int personAge;
private String personAddress;
@OneToOne
private Aadharcard aadharcard;
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public int getPersonAge() {
	return personAge;
}
public void setPersonAge(int personAge) {
	this.personAge = personAge;
}
public String getPersonAddress() {
	return personAddress;
}
public void setPersonAddress(String personAddress) {
	this.personAddress = personAddress;
}
public Aadharcard getAadharcard() {
	return aadharcard;
}
public void setAadharcard(Aadharcard aadharcard) {
	this.aadharcard = aadharcard;
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
			+ ", personAddress=" + personAddress + ", aadharcard=" + aadharcard + "]";
}


}
