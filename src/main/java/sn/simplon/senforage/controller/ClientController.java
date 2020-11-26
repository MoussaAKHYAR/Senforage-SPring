package sn.simplon.senforage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import sn.simplon.senforage.dao.IClient;
import sn.simplon.senforage.entities.Client;

@Controller
public class ClientController {
	@Autowired
	private IClient clientdao;

	@GetMapping("/Client")
	public String liste(Model model) {
		model.addAttribute("liste_clients", clientdao.findAll(Sort.by(Sort.Direction.ASC, "id")));
		return "client/liste";
	}

	@PostMapping(value = { "/addClient" })
	public String addVillage(@Validated Client client) {
		// save the client
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