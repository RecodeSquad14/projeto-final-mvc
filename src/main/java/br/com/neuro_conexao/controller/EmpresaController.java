package br.com.neuro_conexao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.neuro_conexao.model.Empresa;
import br.com.neuro_conexao.services.EmpresaService;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping("/listar")
	public String ListEmpresas(Model model) {
		List<Empresa> empresas = empresaService.getAllEmpresas();
		model.addAttribute("empresas", empresas);
		return "empresas-adm";
	}
	
	public String showFormAdd(Model model) {
		Empresa empresa = new Empresa();
		model.addAttribute("empresa",empresa);
		return "form-empresa";
	}
	
	 
}
