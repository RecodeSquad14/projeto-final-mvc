package br.com.neuro_conexao.neuro_conexao.service;

import java.util.List;
import br.com.neuro_conexao.neuro_conexao.model.NeuroDiverso;

public interface NeuroDiversoService {
	List<NeuroDiverso> getAllNeuroDiversos();
	NeuroDiverso getNeuroDiversoById(Long id );
	NeuroDiverso saveNeuroDiverso(NeuroDiverso neurodivesro);
	NeuroDiverso updateNeuroDiverso(Long id, NeuroDiverso neurodiversoAtualizada);
	void deleteNeuroDiverso(Long id);
}