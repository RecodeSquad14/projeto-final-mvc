package br.com.neuro_conexao.neuro_conexao.model;

import java.util.Date;
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

	private long id_neurodiverso;
	private String neurodivergencia;
	private String nome;
	private String cpf;
	private String senha;
	private String telefone;
	private Date datanascimento;
	@Column(columnDefinition = "TEXT")
	private String pessoadesuporte;

	
	public NeuroDiverso() {

	}

	public NeuroDiverso(long id_neurodiverso, String neurodivergencia, String nome, String cpf, String senha,
			String telefone, Date datanascimento, String pessoadesuporte) {

		this.id_neurodiverso = id_neurodiverso;
		this.neurodivergencia = neurodivergencia;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.telefone = telefone;
		this.datanascimento = datanascimento;
		this.pessoadesuporte = pessoadesuporte;
	}

	public long getInd_neurodiverso() {
		return id_neurodiverso;
	}

	public void setInd_neurodiverso(long ind_neurodiverso, long id_neurodiverso) {
		this.id_neurodiverso = id_neurodiverso;
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

	public Date getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getPessoadesuporte() {
		return pessoadesuporte;
	}

	public void setPessoadesuporte(String pessoadesuporte) {
		this.pessoadesuporte = pessoadesuporte;
	}

	
}
