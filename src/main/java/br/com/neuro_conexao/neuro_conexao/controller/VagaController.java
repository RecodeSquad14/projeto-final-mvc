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

import br.com.neuro_conexao.neuro_conexao.model.Vaga;
import br.com.neuro_conexao.neuro_conexao.services.VagaService;


@Controller
@RequestMapping("/vagas")
public class VagaController {
	@Autowired
	private VagaService vagaService;
	
	//listar
	@GetMapping
	public String ListVaga(Model model) {
		List<Vaga> vagas = vagaService.getAllVagas();
		model.addAttribute("empresas", vagas);
		return "pages/empresas-adm";
	}
	
	// Formulario Criação
	@GetMapping("/novo")
	public String showFormAdd(Model model) {
		Vaga vaga = new Vaga();
		model.addAttribute("vaga",vaga);
		return "pages/form-empresa";
	}
	
	//Persistencia Criação 
	 public String saveVAga(@ModelAttribute("vaga") Vaga vaga) {
		 vagaService.saveVaga(vaga);
		 return "redirect:/forms/form-empresa";
	 }
	 
	 // Formulario de edição
	 @GetMapping("/editar/{id}")
	 public String showFormForUpdate(@PathVariable Long id, Model model) {
		 Vaga vaga = vagaService.getVagaById(id);
		 model.addAttribute("vaga",vaga);
		 return "pages/forms/edit-forms/eidt-form-empresas";
	 }
	 
	 //Persistencia de Edição
	 @PostMapping("/editar/{id}")
	 public String updateVaga(@PathVariable Long id,@ModelAttribute("vaga") Vaga vaga) {
		 vagaService.updateVaga(id, vaga);
		 return "pages/empresas-adm";
	 }
	 
	 // Excluir empresa
	 @GetMapping("/deletar/{id}")
	 public String deleteEmpresa(@PathVariable Long id) {
		 vagaService.deleteVaga(id);
		 return "pages/empresas-adm";
	 }
}
