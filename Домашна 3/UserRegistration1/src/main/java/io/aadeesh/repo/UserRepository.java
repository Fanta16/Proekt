package io.aadeesh.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.aadeesh.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("from User where user_username=?1")
	public List<User> findByUsername(String email);
	
	@Query("from User where user_username=?1 and user_password=?2")
	public User findByUsernamePassword(String username,String password);

}
