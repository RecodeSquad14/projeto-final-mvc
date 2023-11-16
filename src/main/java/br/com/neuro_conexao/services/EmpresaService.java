package br.com.neuro_conexao.services;

import java.util.List;

import br.com.neuro_conexao.model.Empresa;

public interface EmpresaService {
	
	List<Empresa> getAllEmpresas();
	
	Empresa getEmpresaById(Long id);
	
	Empresa saveEmpresa(Empresa empresa);
	
	Empresa updateEmpresa(Long id, Empresa empresaAtt);
	
	void deleteEmpresa(Long id);
}
