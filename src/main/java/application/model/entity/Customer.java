package application.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import application.logic.validation.ContactInfo;

@Entity
public class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
	
    
    @ContactInfo
    private String contactInfo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}    
	
}
