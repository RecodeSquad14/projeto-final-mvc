package br.com.neuro_conexao.neuro_conexao.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.neuro_conexao.neuro_conexao.model.NeuroDiverso;
import br.com.neuro_conexao.neuro_conexao.repositories.NeuroDiversoRepository;
import br.com.neuro_conexao.neuro_conexao.service.NeuroDiversoService;

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
	public NeuroDiverso getNeuroDiversoById(long id_neurodiverso) {
		
		return neurodiversoRepository.findById(id_neurodiverso).orElse(null);
	}

	@Override
	@Transactional
	public NeuroDiverso saveNeuroDiverso(NeuroDiverso neurodiverso) {
		
		return neurodiversoRepository.save(neurodiverso);
	}

	@Override
	public NeuroDiverso updateNeuroDiverso(long id_neurodiverso, NeuroDiverso neurodiversoAtualizada) {

	NeuroDiverso neurodiversoExistente = neurodiversoRepository.findById(id_neurodiverso).orElse(null);
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
		throw new RuntimeException("NueroDiverso com o ID" + id_neurodiverso + "nao encontrado.");
		
	}
	
	
	}

	public void deleteNeuroDiverso(long id_neurodiverso) {
		neurodiversoRepository.deleteById(id_neurodiverso);
		
	}
}