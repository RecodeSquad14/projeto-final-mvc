package br.com.neuro_conexao.neuro_conexao.controllers;

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
import br.com.neuro_conexao.neuro_conexao.services.NeuroDiversoService;

@Controller
@RequestMapping("/neurodiverso")
public class NeuroDiversoController {

	@Autowired
	private NeuroDiversoService neurodiversoService;

	// Listar
	@GetMapping("/neurodiverso")
	public String listNeuroDiverso(Model model) {
		List<NeuroDiverso> neurodiversos = neurodiversoService.getAllNeuroDiversos();
		model.addAttribute("neurodiversos", neurodiversos);
		return "pages/usuarios-adm";
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
	public String saveNeuroDiverso(@ModelAttribute("neurodiverso") NeuroDiverso neurodiverso) {
		neurodiversoService.saveNeuroDiverso(neurodiverso);
		return"redirect:/neurodiverso/neurodiverso";
	}

	// Formulário de edição

	@GetMapping("/editar/{id}")
	public String showFormForUpdate(@PathVariable Long id, Model model) {
		NeuroDiverso neurodiverso = neurodiversoService.getNeuroDiversoById(id);
		model.addAttribute("neurodiverso", neurodiverso);
		return"/pages/forms/edit-forms/edit-form-neurodiverso";
	}

	// Persistencia da edição

	@PostMapping("/edit/{id}")
	public String updateNeurodiverso(@PathVariable Long id, @ModelAttribute("neurodiverso") NeuroDiverso neurodiverso) {
		neurodiversoService.updateNeuroDiverso(id, neurodiverso);
		return"redirect:/neurodiverso/neurodiverso";
	}

	// Excluir

	@GetMapping("/deletar/{id}")
	public String deleteNeurodiverso(@PathVariable Long id) {
		neurodiversoService.deleteNeuroDiverso(id);
		return"redirect:/neurodiverso/neurodiverso";
	}

}
