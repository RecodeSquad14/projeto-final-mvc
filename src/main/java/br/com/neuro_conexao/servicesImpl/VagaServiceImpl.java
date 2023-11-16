package br.com.neuro_conexao.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.neuro_conexao.model.Vaga;
import br.com.neuro_conexao.repositories.VagaRepository;
import br.com.neuro_conexao.services.VagaService;

public class VagaServiceImpl implements VagaService{
	
	@Autowired
	private VagaRepository vagaRepository;
	
	@Override
	public List<Vaga> getAllVagas() {
		return vagaRepository.findAll();
	}

	@Override
	@Transactional(readOnly= true)
	public Vaga getVagaById(Long id) {
		return vagaRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Vaga saveVaga(Vaga vaga) {
		return vagaRepository.save(vaga);
	}

	@Override
	public Vaga updateVaga(Long id, Vaga vagaAtt) {
		Vaga vagaExistente = vagaRepository.findById(id).orElse(null);
		if(vagaExistente != null) {
			vagaExistente.setDescricao(vagaAtt.getDescricao());
			return vagaRepository.save(vagaExistente);
		}else {
			throw new RuntimeException("Vaga com Id "+ id + " não encontrada");
		}
	}

	@Override
	public void deleteVaga(Long id) {
		vagaRepository.deleteById(id);
		
	}
	

}
