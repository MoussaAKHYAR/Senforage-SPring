package sn.simplon.senforage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sn.simplon.senforage.dao.IVillage;
import sn.simplon.senforage.entities.Village;

@Controller
public class VillageController {
	@Autowired
	private IVillage villagedao;
	
	@GetMapping("/Village")
	public String liste(Model model) {
		model.addAttribute("liste_villages", villagedao.findAll());
		return "village/liste";
	}
	
	/*
	 * @PostMapping("Village/liste") public String add()(@ModelAttribute Village
	 * village, Model model) { model.addAttribute("village", village); return
	 * "village/liste"; }
	 */
	/*
	 * @RequestMapping(value="Village/liste") public ModelAndView liste() {
	 * List<Village> villages = villagedao.findAll(); return new
	 * ModelAndView("village/liste","liste_villages",villages); }
	 */

}
