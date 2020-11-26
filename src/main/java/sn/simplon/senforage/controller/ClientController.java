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
		model.addAttribute("liste_clients", clientdao.findAll(Sort.by(Sort.Direction.ASC,"id")));
		return "client/liste";
	}
	
	@PostMapping(value= {"/addClient"})
	public String addVillage(@Validated Client client) {
		//save the village 
		clientdao.save(client);
		return "redirect:/Client";
	}
	
	@GetMapping(value= {"/delete"})
	public String deleteCLient(int id) {
		//save the village 
		clientdao.deleteById(id);
		return "redirect:/Client";
	}
}