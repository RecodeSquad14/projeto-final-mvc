package br.com.neuro_conexao.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Empresa {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empresa;
	private String nome;
	private String cnpj;
	private String endereco;
	private String email_corporativo;
	private String senha;
	
	@OneToMany	
	private Set<Vaga> vagas = new HashSet<>(); 	
	
	public Empresa() {
		
	}
	
	public Empresa(Long id, String nome, String cnpj, String endereco,String email_corporatico, String senha) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setEndereco(endereco);
		this.setEmail_corporativo(email_corporatico);
		this.setSenha(senha);
	}
	
	
	public Long getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail_corporativo() {
		return email_corporativo;
	}

	public void setEmail_corporativo(String email_corporativo) {
		this.email_corporativo = email_corporativo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
}
