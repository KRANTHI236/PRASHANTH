package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pancard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int pancardId;
private String pancardNumber;
private String pancardAuthority;
@OneToOne(mappedBy = "pancard")
private Person person;
public int getPancardId() {
	return pancardId;
}
public void setPancardId(int pancardId) {
	this.pancardId = pancardId;
}
public String getPancardNumber() {
	return pancardNumber;
}
public void setPancardNumber(String pancardNumber) {
	this.pancardNumber = pancardNumber;
}
public String getPancardAuthority() {
	return pancardAuthority;
}
public void setPancardAuthority(String pancardAuthority) {
	this.pancardAuthority = pancardAuthority;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
@Override
public String toString() {
	return "Pancard [pancardId=" + pancardId + ", pancardNumber=" + pancardNumber + ", pancardAuthority="
			+ pancardAuthority + "]";
}


}
