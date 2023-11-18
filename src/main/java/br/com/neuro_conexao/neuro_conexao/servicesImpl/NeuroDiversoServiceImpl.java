package br.com.neuro_conexao.neuro_conexao.servicesImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.neuro_conexao.neuro_conexao.model.NeuroDiverso;
import br.com.neuro_conexao.neuro_conexao.repositories.NeuroDiversoRepository;
import br.com.neuro_conexao.neuro_conexao.services.NeuroDiversoService;

@Service
public class NeuroDiversoServiceImpl implements NeuroDiversoService {
	
	@Autowired
private NeuroDiversoRepository neurodiversoRepository;

	@Override
	public List<NeuroDiverso> getAllNeuroDiversos() {
		return neurodiversoRepository.findAll();
	}

	
	@Override
	@Transactional(readOnly = true)
	public NeuroDiverso getNeuroDiversoById(Long id) {
		
		return neurodiversoRepository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public NeuroDiverso saveNeuroDiverso(NeuroDiverso neurodiverso) {
		
		return neurodiversoRepository.save(neurodiverso);
	}

	@Override
	public NeuroDiverso updateNeuroDiverso(Long id, NeuroDiverso neurodiversoAtualizada) {

	NeuroDiverso neurodiversoExistente = neurodiversoRepository.findById(id).orElse(null);
	if (neurodiversoExistente != null) {
		neurodiversoExistente.setNeurodivergencia(neurodiversoAtualizada.getNeurodivergencia());
		neurodiversoExistente.setNome(neurodiversoAtualizada.getNome());
		neurodiversoExistente.setCpf(neurodiversoAtualizada.getCpf());
		neurodiversoExistente.setSenha(neurodiversoAtualizada.getSenha());
		neurodiversoExistente.setTelefone(neurodiversoAtualizada.getTelefone());
		neurodiversoExistente.setDatanascimento(neurodiversoAtualizada.getDatanascimento());
		neurodiversoExistente.setPessoadesuporte(neurodiversoAtualizada.getPessoadesuporte());
		return neurodiversoRepository.save(neurodiversoExistente);
		
		
	}else {
		throw new RuntimeException("NueroDiverso com o ID" + id + "nao encontrado.");
		
	}
	
	
	}

	public void deleteNeuroDiverso(Long id) {
		neurodiversoRepository.deleteById(id);
		
	}
}