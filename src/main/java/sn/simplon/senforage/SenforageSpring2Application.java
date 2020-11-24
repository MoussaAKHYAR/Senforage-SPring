package sn.simplon.senforage;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sn.simplon.senforage.dao.IRole;
import sn.simplon.senforage.dao.IUser;
import sn.simplon.senforage.entities.Role;
import sn.simplon.senforage.entities.User;


@SpringBootApplication

public class SenforageSpring2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SenforageSpring2Application.class, args);
		
		
		/*
		 * IUser iUser = ctx.getBean(IUser.class);
		 * 
		 * Role roles = new Role(); roles.setId(1); roles.setNom("admin");
		 * 
		 * User user = new User(); user.setId(1); user.setNom("Barry");
		 * user.setPrenom("Moussa"); user.setEmail("amrane@simplon.sn");
		 * user.setPassword("passer"); user.setEtat(1);
		 * 
		 * List<Role> roless = new ArrayList<>(); roless.add(roles);
		 * user.setRoles(roless);
		 */
		  
			/*
			 * List<User> users = new ArrayList<User>(); users.add(user);
			 * 
			 * roles.setUsers(users);
			 * 
			 * IRole iRole = ctx.getBean(IRole.class);
			 */
			/*
			 * try { iUser.save(user); //System.out.println("ok"); //iRole.save(roles); }
			 * catch (Exception e) { // TODO: handle exception e.printStackTrace(); }
			 */
	}

}
