package br.com.neuro_conexao.neuro_conexao.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.neuro_conexao.neuro_conexao.model.NeuroDiverso;
import br.com.neuro_conexao.neuro_conexao.service.NeuroDiversoService;

@Controller
@RequestMapping("/neurodiverso")
public class NeuroDiversoController {

	@Autowired
	private NeuroDiversoService neurodiversoService;

	// Listar
	@GetMapping("/usuarios-adm")
	public String listNeuroDiverso(Model model) {
		List<NeuroDiverso> neurodiversos = neurodiversoService.getAllNeuroDiversos();
		model.addAttribute("neurodiversos", neurodiversos);
		return "/pages/usuarios-adm";
	}

	// Formulário de criação
	@GetMapping("/novo")
	public String showFormForAdd(Model model) {
		NeuroDiverso neurodiverso = new NeuroDiverso();
		model.addAttribute("neurodiverso", neurodiverso);
		return "/pages/forms/form-neurodiverso";
	}

	// Persistencia da criação
	@PostMapping("/save")
	public String saveNeurodiverso(@ModelAttribute("neurodiverso") NeuroDiverso neurodiverso) {
		neurodiversoService.saveNeuroDiverso(neurodiverso);
		return "redirect:/pages/forms/form-neurodiverso";
	}

	// Formulário de edição
	@GetMapping("/editar/{id_neurodiverso}")
	public String showFormForUpdate(@PathVariable long id_neurodiverso, Model model) {
		NeuroDiverso neurodiverso = neurodiversoService.getNeuroDiversoById(id_neurodiverso);
		model.addAttribute("neurodiverso", neurodiverso);
		return "/pages/forms/form-neurodiverso";
	}

	// Persistencia da edição
	@PostMapping("/editar/{id_neurodiverso}")
	public String updateNeurodiverso(@PathVariable long id_neurodiverso, @ModelAttribute("neurodiverso") 
	NeuroDiverso neurodiverso) {
		neurodiversoService.updateNeuroDiverso(id_neurodiverso, neurodiverso);
		return "redirect:/pages/forms/form-neurodiverso";
	}
	
	// Excluir 
	@GetMapping("/deletar/{id_neurodiverso}")
	public String deleteNeurodiverso(@PathVariable long id_neurodiverso) { 
		neurodiversoService.deleteNeuroDiverso(id_neurodiverso);
		return "redirect:/pages/usuarios-adm";
	}

}
