package main.authenticate;

import java.util.HashMap;
import java.util.Map;

import main.dto.UserDto;

public class CheckCredentials {
	
	private UserDto userDto=new UserDto();
	
	private Map<String,UserDto> userMap=new HashMap<>();
	
	public CheckCredentials(){
		userDto.setUserName("sanjay");
		userDto.setLocation("Chennai");
		userMap.put("sanjay", userDto);
	}
	
	public boolean authenticate(String username,String password) {
		if(password!=null && password.trim()!="") {
			return true;
		}
		return false;
	}
	
	public UserDto getUserName(String userId) {
		return userMap.get(userId);
	}

}
