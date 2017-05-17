package application.logic.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactInfoValidator implements ConstraintValidator<ContactInfo, String> {
    
    private static final Logger LOG = LoggerFactory.getLogger(ContactInfoValidator.class);
 
    @Override
    public void initialize(ContactInfo contactInfo) {
    	
    	if(contactInfo == null) {    		
    		LOG.error("contactInfo is null");
    	}
    	
    }
 
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
    	
    	boolean isValid = false;
    	
    	if(!value.isEmpty()){    		
    		isValid = true;
    	}
        
        return isValid;
    }
}