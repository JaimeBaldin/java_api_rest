package com.testeapi.minhaapi.repository;
import com.testeapi.minhaapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;


public interface UserRepository extends MongoRepository<User, String>{
	Optional<User>  findByLogin(String login);
}
