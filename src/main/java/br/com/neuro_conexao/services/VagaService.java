package br.com.neuro_conexao.services;

import java.util.List;

import br.com.neuro_conexao.model.Vaga;

public interface VagaService {
	List<Vaga> getAllVagas();
	
	Vaga getVagaById(Long id);
	
	Vaga saveVaga(Vaga vaga);
	
	Vaga updateVaga(Long id, Vaga vagaAtt);
	
	void deleteVaga(Long id);
}
