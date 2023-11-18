package br.com.neuro_conexao.neuro_conexao.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_empresa;
import br.com.neuro_conexao.neuro_conexao.repositories.Treinamento_empresaRepository;
import br.com.neuro_conexao.neuro_conexao.services.ProfissionalService;
import br.com.neuro_conexao.neuro_conexao.services.Treinamento_empresaService;

@Service
public class Treinamento_empresaServiceImpl implements Treinamento_empresaService {

	@Autowired
	private Treinamento_empresaRepository treinamento_empresaRepository;

	@Autowired
	private ProfissionalService profissionalService;

	@Override
	public List<Treinamento_empresa> getAllTreinamento_empresa() {
		return treinamento_empresaRepository.findAll();
	}

	@Override
	public Treinamento_empresa getTreinamento_empresaById(Long id) {
		return null;
	}

	@Override
	public Treinamento_empresa saveTreinamento_empresa(Treinamento_empresa treinamento_empresa,
			List<Long> profissionaisIds) {
		return null;
	}

	@Override
	public Treinamento_empresa updateTreinamento_empresa(Long id, Treinamento_empresa treinamento_empresaAtualizado) {
		return null;
	}

	@Override
	public void deleteTreinamento_empresa(Long id) {
		this.treinamento_empresaRepository.deleteById(id);
	}

}
