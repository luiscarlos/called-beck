package br.com.lc.called.model;

import java.util.ArrayList;
import java.util.List;

public class AnalistaQualidade extends Pessoa{

	
	private List<Chamado> chamados = new ArrayList<>();

	public AnalistaQualidade() {
		super();
	
	}

	public AnalistaQualidade(Integer id, String login, String senha) {
		super(id, login, senha);
	}

	
	
	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}
	
	
	
	
}
