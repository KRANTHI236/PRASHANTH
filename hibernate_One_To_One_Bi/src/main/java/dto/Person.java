package dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int personId;
private String personName;
private int personAge;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn
private Pancard pancard;
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
public Pancard getPancard() {
	return pancard;
}
public void setPancard(Pancard pancard) {
	this.pancard = pancard;
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + ", pancard="
			+ pancard + "]";
}

}
