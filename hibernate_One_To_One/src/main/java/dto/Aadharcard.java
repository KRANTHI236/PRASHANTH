package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aadharcard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int aadharcardId;
private long aadharcardNumber;
private String aadharcardAuthority;
public int getAadharcardId() {
	return aadharcardId;
}
public void setAadharcardId(int aadharcardId) {
	this.aadharcardId = aadharcardId;
}
public long getAadharcardNumber() {
	return aadharcardNumber;
}
public void setAadharcardNumber(long aadharcardNumber) {
	this.aadharcardNumber = aadharcardNumber;
}
public String getAadharcardAuthority() {
	return aadharcardAuthority;
}
public void setAadharcardAuthority(String aadharcardAuthority) {
	this.aadharcardAuthority = aadharcardAuthority;
}
@Override
public String toString() {
	return "Aadharcard [aadharcardId=" + aadharcardId + ", aadharcardNumber=" + aadharcardNumber
			+ ", aadharcardAuthority=" + aadharcardAuthority + "]";
}


}
