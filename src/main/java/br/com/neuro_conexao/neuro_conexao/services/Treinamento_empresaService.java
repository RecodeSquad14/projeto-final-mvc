package br.com.neuro_conexao.neuro_conexao.services;

import java.util.List;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_empresa;

public interface Treinamento_empresaService {

	List<Treinamento_empresa> getAllTreinamento_empresa();

	Treinamento_empresa getTreinamento_empresaById(Long id);

	Treinamento_empresa saveTreinamento_empresa(Treinamento_empresa treinamento_empresa, List<Long> profissionaisIds);

	Treinamento_empresa updateTreinamento_empresa(Long id, Treinamento_empresa treinamento_empresaAtualizado);

	void deleteTreinamento_empresa(Long id);

}
