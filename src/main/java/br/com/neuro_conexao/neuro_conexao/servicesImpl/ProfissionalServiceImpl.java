package br.com.neuro_conexao.neuro_conexao.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.neuro_conexao.neuro_conexao.model.Profissional;
import br.com.neuro_conexao.neuro_conexao.repositories.ProfissionalRepository;
import br.com.neuro_conexao.neuro_conexao.services.ProfissionalService;


@Service

	public class ProfissionalServiceImpl implements ProfissionalService {



		
		@Autowired
		private ProfissionalRepository profissionalRepository;

		@Override
		public List<Profissional> getAllProfissionais() {
			return profissionalRepository.findAll();
			}

		@Override
		@Transactional(readOnly = true)
		public Profissional getProfissionalById(Long id) {
			return profissionalRepository.findById(id).orElse(null);
		}

		@Override
		@Transactional
		public Profissional saveProfissional(Profissional profissional) {
			return profissionalRepository.save(profissional);
		}

		@Override
		public Profissional updateProfissional(Long id, Profissional profissionalAtualizado) {
			Profissional profissionalExistente = profissionalRepository.findById(id).orElse(null);
			if (profissionalExistente != null) { 
				profissionalExistente.setArea_de_atuacao(profissionalAtualizado.getArea_de_atuacao());
				profissionalExistente.setNome(profissionalAtualizado.getNome());
				profissionalExistente.setEmail(profissionalAtualizado.getEmail());
				profissionalExistente.setSenha(profissionalAtualizado.getSenha());
			
				return profissionalRepository.save(profissionalExistente);
			} else { 
				throw new RuntimeException("Profissional com o ID" + id + "não encontrada.");
			}
		}

		@Override
		public void deleteProfissional(Long id) {
			profissionalRepository.deleteById(id);
		}
		
		
}
