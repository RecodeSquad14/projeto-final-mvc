package br.com.neuro_conexao.neuro_conexao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_empresa;
import br.com.neuro_conexao.neuro_conexao.services.Treinamento_empresaService;


	@RequestMapping("/treinamentos")

	public class Treinamento_empresaController {
	
	@Autowired
	private Treinamento_empresaService treinamento_empresaService;

	// Listar
	@GetMapping 
	public String listTreinamento_empresa(Model model) {
		List<Treinamento_empresa> treinamento_empresa = treinamento_empresaService.getAllTreinamento_empresa();
		model.addAttribute("treinamento_empresa", treinamento_empresa);
		return "/pages/treinamento";
	}
}

