package br.com.neuro_conexao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neuro_conexao.model.Vaga;


@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {

}
