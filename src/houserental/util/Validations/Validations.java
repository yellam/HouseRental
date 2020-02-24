package houserental.util.Validations;

import java.util.HashMap;
import java.util.Map;

import houserental.dto.User.User;

public class Validations {
	
	Map<String,String> errorMessages=new HashMap<String,String>();
	
	public Map<String,String> validate(User user) {
		
		if(user.getFullname().isEmpty()) {
			errorMessages.put("fullnameerror","Enter fullname");
		}
		if(user.getEmail().isEmpty()) {
			errorMessages.put("emailerror","Enter Email");
		}
		
		if(user.getMobile().isEmpty()) {
			errorMessages.put("mobileerror","Enter mobile");
		}
		else if(!(user.getMobile().length()==10 || mobileValidate(user.getMobile()))) {
			errorMessages.put("mobileerror","Enter mobile");
		}
		if(user.getUsername().isEmpty()) {
			errorMessages.put("usernameerror","Enter email");
		}
		if(user.getPassword().isEmpty()) {
			errorMessages.put("passworderror","Enter password");
		}
		if(user.getConfirmpassword().isEmpty()) {
			errorMessages.put("confirmpassword","Enter confirmpassword");
		}
		if(!(user.getPassword().equals(user.getConfirmpassword()))) {
			errorMessages.put("passwordmatcchingerror","Enter matching password");
		}
		return errorMessages;
		
	}
	
	public boolean mobileValidate(String mobile) {
			for (int index = 0; index < mobile.length(); index++) {
				char ch = mobile.charAt(index);
				if (!(Character.isDigit(ch))) {
					return false;
				}
			}
			return true;
		}
	public Map<String,String> logInValidate(User user){
		if(user.getEmail().isEmpty()) {
			errorMessages.put("emailerror","Enter Email");
		}
		if(user.getPassword().isEmpty()) {
			errorMessages.put("passworderror","Enter Password");
		}
		
		return errorMessages;
				
	}
	
	

}

