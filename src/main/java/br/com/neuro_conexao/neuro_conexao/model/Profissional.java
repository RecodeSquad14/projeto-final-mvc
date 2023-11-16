package br.com.neuro_conexao.neuro_conexao.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "profissional")
public class Profissional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String area_de_atuacao;

	private String nome;

	private String cpf;

	private String email;

	private String senha;

	@Column(unique = true)
	private String crp;
	
	@OneToMany(mappedBy="profissional")
	private Set<Treinamento_empresa> treinamentos;

	public Profissional() {}
	
	public Profissional(Long id, String area_de_atuacao, String crp, String nome, String cpf, String email, String senha) {
		this.id = id;
		this.area_de_atuacao = area_de_atuacao;
		this.crp = crp;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

	public Profissional(String area_de_atuacao, String crp, String nome, String cpf, String email, String senha) {
		this.area_de_atuacao = area_de_atuacao;
		this.crp = crp;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCrp() {
		return crp;
	}

	public void setCrp(String crp) {
		this.crp = crp;
	}

	public String getArea_de_atuacao() {
		return area_de_atuacao;
	}

	public void setArea_de_atuacao(String area_de_atuacao) {
		this.area_de_atuacao = area_de_atuacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
