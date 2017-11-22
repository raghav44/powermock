package com.powermock.dao;

import com.powermock.dao.util.IDGenerator;
import com.powermock.dto.User;

public class UserDAO {
	
	public int create(User user) {
		
		int id = IDGenerator.generateID();
		
		return id;
	}
	
	
	

}
