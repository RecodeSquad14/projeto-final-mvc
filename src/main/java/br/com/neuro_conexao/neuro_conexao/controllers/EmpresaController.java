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

import br.com.neuro_conexao.neuro_conexao.model.Empresa;
import br.com.neuro_conexao.neuro_conexao.services.EmpresaService;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {
	@Autowired
	private EmpresaService empresaService;
	
	//listar
	@GetMapping
	public String ListEmpresas(Model model) {
		List<Empresa> empresas = empresaService.getAllEmpresas();
		model.addAttribute("empresas", empresas);
		return "pages/empresas-adm";
	}
	
	// Formulario Criação
	@GetMapping("/novo")
	public String showFormAdd(Model model) {
		Empresa empresa = new Empresa();
		model.addAttribute("empresa",empresa);
		return "pages/forms/form-empresa";
	}
	
	//Persistencia Criação 
	@PostMapping("/save")
	 public String saveEmpresa(@ModelAttribute("empresa") Empresa empresa) {
		 empresaService.saveEmpresa(empresa);
		 return "redirect:/empresas";
	 }
	 
	 // Formulario de edição
	 @GetMapping("/editar/{id}")
	 public String showFormForUpdate(@PathVariable Long id, Model model) {
		 Empresa empresa = empresaService.getEmpresaById(id);
		 model.addAttribute("empresa",empresa);
		 return "pages/forms/edit-forms/edit-form-empresas";
	 }
	 
	 //Persistencia de Edição
	 @PostMapping("/editar/{id}")
	 public String updateEmpresa(@PathVariable Long id,@ModelAttribute("empresa") Empresa empresa) {
		 empresaService.updateEmpresa(id, empresa);
		 return "redirect:/empresas";
	 }
	 
	 // Excluir empresa
	 @GetMapping("/deletar/{id}")
	 public String deleteEmpresa(@PathVariable Long id) {
		 empresaService.deleteEmpresa(id);
		 return "redirect:/empresas";
	 }
}
