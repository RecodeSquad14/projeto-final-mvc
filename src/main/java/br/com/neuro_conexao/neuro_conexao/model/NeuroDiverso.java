package br.com.neuro_conexao.neuro_conexao.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "neurodiverso")
public class NeuroDiverso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String neurodivergencia;
	private String nome;
	private String cpf;
	private String senha;
	private String telefone;
	private String datanascimento;
	@Column(columnDefinition = "TEXT")
	private String pessoadesuporte;
	

	
	public NeuroDiverso() {

	}

	

	public NeuroDiverso(Long id, String neurodivergencia, String nome, String cpf, String senha, String telefone,
			String datanascimento, String pessoadesuporte) {
		
		this.id = id;
		this.neurodivergencia = neurodivergencia;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.telefone = telefone;
		this.datanascimento = datanascimento;
		this.pessoadesuporte = pessoadesuporte;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNeurodivergencia() {
		return neurodivergencia;
	}

	public void setNeurodivergencia(String neurodivergencia) {
		this.neurodivergencia = neurodivergencia;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getPessoadesuporte() {
		return pessoadesuporte;
	}

	public void setPessoadesuporte(String pessoadesuporte) {
		this.pessoadesuporte = pessoadesuporte;
	}

	
}
