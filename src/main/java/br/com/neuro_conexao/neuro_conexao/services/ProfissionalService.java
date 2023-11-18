package br.com.neuro_conexao.neuro_conexao.services;

import java.util.List;

import br.com.neuro_conexao.neuro_conexao.model.Profissional;

public interface ProfissionalService {

List<Profissional> getAllProfissionais();
	
	Profissional getProfissionalById(Long id);
	
	Profissional saveProfissional(Profissional profissional);
	
	Profissional updateProfissional(Long id, Profissional profissionalAtualizada);
	
	void deleteProfissional(Long id);
}

