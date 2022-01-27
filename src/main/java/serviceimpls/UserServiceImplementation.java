package serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import models.User;
import repos.UserRepository;
import services.UserService;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return this.userRepository.save(user);
	}

	@Override
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return this.userRepository.findFirstByUsername(username);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}
	
}