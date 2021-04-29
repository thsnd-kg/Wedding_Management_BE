package home.javaweb.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import home.javaweb.dto.UserDTO;
import home.javaweb.entity.UserEntity;
import home.javaweb.service.IUserService;

@RestController
public class UserAPI {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/quan-tri/user")
	public List<UserDTO> findAll() {
		return userService.findAll();
	}
}
