package com.testeapi.minhaapi.service;

import com.testeapi.minhaapi.model.User;
import com.testeapi.minhaapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> listarUsuario() {
		return userRepository.findAll();
	}
	
	public Optional<User> buscarPorLogin(String login){
		return userRepository.findByLogin(login);
	}
	
	public User cadastrarUsuario(User user) {
		return userRepository.save(user);
	}
}
