/**
 * 
 */
package services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import services.domain.User;
import services.repository.UserRepository;

/**
 * @author derekhe
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String addNewUser(@RequestParam(value = "name") String name, @RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password) {

		userRepository.save(new User(name, email, password));
		return "hello:" + name + " password:" + password;
	}
}
