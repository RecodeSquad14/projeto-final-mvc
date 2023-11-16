package br.com.neuro_conexao.neuro_conexao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_empresa;

@Repository
public interface Treinamento_empresaRepository extends JpaRepository<Treinamento_empresa, Long> {

}
