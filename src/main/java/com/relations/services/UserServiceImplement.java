package com.relations.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.relations.dao.RoleRepository;
import com.relations.dao.UserRepository;
import com.relations.model.Profile;
import com.relations.model.Role;
import com.relations.model.User;

@Service
public class UserServiceImplement implements UserService {


	@Autowired
	private UserRepository userRepository;

	@Autowired
	private 	RoleRepository roleRepository;
	
	@Override
	public User CreateOneUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User AddRoleToUser(User user, Role role) {
		// TODO Auto-generated method stub
		//user.setRoles(null);
		roleRepository.save(role);
		user.getRoles().add(role);
		return CreateOneUser(user);
	}

	@Override
	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<User> findActive(boolean active) {
		// TODO Auto-generated method stub
		/*if(userRepository.findByActive(active).isPresent())
		return userRepository.findByActive(active).get();
		else
return null;
*/
		return userRepository.findByActive(active).orElseThrow();
	}

	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username).orElseThrow();
	}

	@Override
	public User Authentification(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByUsernameAndPassword(username, password).orElseThrow();
	}

	@Override
	public User findOneUser(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow();
	}

	@Override
	public void deleteOne(long id) {
		// TODO Auto-generated method stub
		if(findOneUser(id)!=null)
userRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
userRepository.deleteAll();
	}

	@Override
	public User createProfile(User user, Profile profile) {
		// TODO Auto-generated method stub
User us=CreateOneUser(user);
us.setProfile(profile);
		
		return userRepository.save(us);
	}

}
