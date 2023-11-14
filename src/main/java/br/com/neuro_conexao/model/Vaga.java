package br.com.neuro_conexao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_vaga;
	@Column(columnDefinition = "TEXT")
	private String descricao;
	
	
	
	public Vaga() {
		
	}
	public Long getId_vaga() {
		return Id_vaga;
	}
	public void setId_vaga(Long id_vaga) {
		Id_vaga = id_vaga;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Vaga(Long id_vaga, String descricao) {
		
		Id_vaga = id_vaga;
		this.descricao = descricao;
	}

	
}
