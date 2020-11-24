package sn.simplon.senforage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.senforage.entities.Role;
import sn.simplon.senforage.entities.User;



@Repository
public interface IRole extends JpaRepository<Role, Integer> {

}
