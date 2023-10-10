package com.relations.services;

import java.util.List;

import com.relations.model.Profile;
import com.relations.model.Role;
import com.relations.model.User;

public interface UserService {
	
	User CreateOneUser(User user);
	User AddRoleToUser( User user,Role role);
	List<User> findUsers();
	List<User> findActive(boolean active);
	User findUserByUserName(String username);
	User Authentification(String username,String password);
	User findOneUser(long id);
	void deleteOne(long id);
	void deleteAll();
	User createProfile(User user,Profile profile );

}
