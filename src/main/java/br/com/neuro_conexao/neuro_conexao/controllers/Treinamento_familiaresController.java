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
import br.com.neuro_conexao.neuro_conexao.model.Treinamento_familiares;
import br.com.neuro_conexao.neuro_conexao.services.Treinamento_familiaresService;

@Controller
@RequestMapping("/treinamento")
public class Treinamento_familiaresController {

	@Autowired
	private Treinamento_familiaresService treinamento_familiaresService;

	// Listar
	@GetMapping
	public String listTreinamento_familiares(Model model) {
		List<Treinamento_familiares> treinamento_familiares = treinamento_familiaresService.getAllTreinamento_familiares();
		model.addAttribute("treinamento_familiares", treinamento_familiares);
		return "#";
	}
}