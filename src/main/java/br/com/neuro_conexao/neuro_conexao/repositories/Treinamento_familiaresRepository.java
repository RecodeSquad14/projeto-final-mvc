package br.com.neuro_conexao.neuro_conexao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.neuro_conexao.neuro_conexao.model.Treinamento_familiares;



@Repository
public interface Treinamento_familiaresRepository extends JpaRepository<Treinamento_familiares, Long> {

}
