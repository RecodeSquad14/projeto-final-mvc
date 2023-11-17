package br.com.neuro_conexao.neuro_conexao.services;

import java.util.List;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_familiares;

public interface Treinamento_familiaresService {

	List<Treinamento_familiares> getAllTreinamento_familiares();

	Treinamento_familiares getTreinamento_familiaresById(Long id);

	Treinamento_familiares saveTreinamento_familiares(Treinamento_familiares treinamento_familiares, List<Long> profissionaisIds);

	Treinamento_familiares updateTreinamento_familiares(Long id, Treinamento_familiares treinamento_familiaresAtualizado);

	void deleteTreinamento_familiares(Long id);

}
