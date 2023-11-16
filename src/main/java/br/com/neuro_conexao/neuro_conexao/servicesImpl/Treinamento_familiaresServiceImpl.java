package br.com.neuro_conexao.neuro_conexao.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_familiares;
import br.com.neuro_conexao.neuro_conexao.repositories.Treinamento_familiaresRepository;
import br.com.neuro_conexao.neuro_conexao.services.ProfissionalService;
import br.com.neuro_conexao.neuro_conexao.services.Treinamento_familiaresService;


@Service
public class Treinamento_familiaresServiceImpl implements Treinamento_familiaresService {

	@Autowired
	private Treinamento_familiaresRepository treinamento_familiaresRepository;

	@Autowired
	private ProfissionalService profissionalService;

	@Override
	public List<Treinamento_familiares> getAllTreinamento_familiares() {
		return treinamento_familiaresRepository.findAll();
	}

	@Override
	public Treinamento_familiares getTreinamento_familiaresById(Long id) {
		return null;
	}

	@Override
	public Treinamento_familiares saveTreinamento_familiares(Treinamento_familiares treinamento_familiares,
			List<Long> profissionaisIds) {
		return null;
	}

	@Override
	public Treinamento_familiares updateTreinamento_familiares(Long id, Treinamento_familiares treinamento_familiaresAtualizado) {
		return null;
	}

	@Override
	public void deleteTreinamento_familiares(Long id) {
		this.treinamento_familiaresRepository.deleteById(id);
	}

}
