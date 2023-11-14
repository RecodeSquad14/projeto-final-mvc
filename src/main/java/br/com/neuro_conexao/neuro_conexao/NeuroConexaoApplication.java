package br.com.neuro_conexao.neuro_conexao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "br.com.neuro_conexao.model")
@SpringBootApplication
public class NeuroConexaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeuroConexaoApplication.class, args);
	}

}
