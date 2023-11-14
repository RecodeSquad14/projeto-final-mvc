package br.com.neuro_conexao.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.neuro_conexao.model.Empresa;

@Controller
public class EmpresaController {
	
	@GetMapping("/Empresas")
	public String ListEmpresas(Model model) {
		
		List<Empresa> empresas = new ArrayList<>();
		
		empresas.add(new Empresa((long) 1, "Empresa ABC", "12345678901234", "Rua A, 123", "contato@empresaabc.com", "senha123"));
		empresas.add(new Empresa((long) 2, "Empresa XYZ", "56789012345678", "Avenida B, 456", "contato@empresaxyz.com", "senha456"));
		model.addAttribute("empresas", empresas);
		
		
		return "empresas";
	}
}
