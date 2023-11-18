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

import br.com.neuro_conexao.neuro_conexao.model.Profissional;
import br.com.neuro_conexao.neuro_conexao.services.ProfissionalService;

@Controller
@RequestMapping("/profissionais")
public class ProfissionalController {

	@Autowired
	private ProfissionalService profissionalService;

	// Listar
	@GetMapping("/profissional-adm")
	public String listProfissionais(Model model) {
		List<Profissional> profissionais = profissionalService.getAllProfissionais();
		model.addAttribute("profissionais", profissionais);
		return "/pages/profissional-adm";
	}

	// Formulário de criação
	@GetMapping("/form")
	public String showFormForAdd(Model model) {
		Profissional profissional = new Profissional();
		model.addAttribute("profissional", profissional);
		return "/pages/forms/form-profissional";
	}

	// Persistencia da criação
	@PostMapping("/save")
	public String saveProfissional(@ModelAttribute("profissional") Profissional profissional) {
		profissionalService.saveProfissional(profissional);
		return "redirect:/profissionais/profissional-adm";
	}

	// Formulário de edição
	@GetMapping("/editar/{id}")
	public String showFormForUpdate(@PathVariable Long id, Model model) {
		Profissional profissional = profissionalService.getProfissionalById(id);
		model.addAttribute("profissional", profissional);
		return "/pages/forms/edit-forms/edit-form-profissional";
	}

	// Persistencia da edição
	@PostMapping("/editar/{id}")
	public String updateProfissonal(@PathVariable Long id, @ModelAttribute("profissional") Profissional profissional) {
		profissionalService.updateProfissional(id, profissional);
		return "redirect:/profissionais/profissional-adm";
	}

	// Excluir categoria
	@GetMapping("/deletar/{id}")
	public String deleteProfissional(@PathVariable Long id) {
		profissionalService.deleteProfissional(id);
		return "redirect:/profissionais/profissional-adm";
	}

}
