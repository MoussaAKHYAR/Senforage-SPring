package sn.simplon.senforage.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import sn.simplon.senforage.dao.IClient;
import sn.simplon.senforage.dao.IUser;
import sn.simplon.senforage.dao.IVillage;
import sn.simplon.senforage.entities.Client;

@Controller
public class ClientController {
	@Autowired
	private IClient clientdao;
	
	@Autowired
	private IVillage villagedao;
	
	@Autowired
	private IUser userdao;

	@GetMapping("/Client")
	public String liste(Model model) {
		model.addAttribute("liste_clients", clientdao.findAll(Sort.by(Sort.Direction.ASC, "id")));
		model.addAttribute("liste_villages", villagedao.findAll(Sort.by(Sort.Direction.ASC, "id")));

		return "client/liste";
	}

	@PostMapping(value = { "/addClient" })
	public String addVillage(@Validated Client client, HttpServletRequest req) {
		//client.setVillage(villagedao.findById(Integer.parseInt(req.getParameter("id_village"))).orElse(null));
		// save the client
		client.setUser(userdao.getOne(1));
		clientdao.save(client);
		return "redirect:/Client";
	}

	@GetMapping(value = { "/deleteClient" })
	public String deleteClient(int id) {
		// delete the client
		clientdao.deleteById(id);
		return "redirect:/Client";
	}

}