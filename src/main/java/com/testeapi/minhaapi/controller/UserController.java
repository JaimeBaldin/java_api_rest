package com.testeapi.minhaapi.controller;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeapi.minhaapi.service.UserService;
import com.testeapi.minhaapi.model.User;

@RestController
@RequestMapping("/usuarios")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> listarUsuarios(){
		return userService.listarUsuario();
	}
	
	@GetMapping("/{login}")
	public Optional<User> buscarPorLogin(@PathVariable String login) {
		return userService.buscarPorLogin(login);
	}
	
	@PostMapping
	public ResponseEntity<User> cadastrarUsuario(@RequestBody User user) {
		User newUser = userService.cadastrarUsuario(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
	}
	
}
