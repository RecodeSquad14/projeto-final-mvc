package br.com.neuro_conexao.neuro_conexao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "treinamento_familiares")
public class Treinamento_familiares {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String tipo_treinamento;

	private String descricao;
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	@ManyToOne
	@JoinColumn(name = "profissional_id", nullable = false)
	private Profissional profissional;

	public Treinamento_familiares() {
	}

	public Treinamento_familiares(Long id, String tipo_treinamento, String descricao) {
		this.id = id;
		this.tipo_treinamento = tipo_treinamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo_treinamento() {
		return tipo_treinamento;
	}

	public void setTipo_treinamento(String tipo_treinamento) {
		this.tipo_treinamento = tipo_treinamento;
	}

}
