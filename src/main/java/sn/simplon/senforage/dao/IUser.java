package sn.simplon.senforage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.simplon.senforage.entities.User;


@Repository
public interface IUser extends JpaRepository<User, Integer > {
	
	  @Query("SELECT u FROM User u WHERE u.email = ?1 AND u.password = ?2") 
	  public User findUserByEmailAndPassword(String email, String password);
	 
	 
																																												

}
