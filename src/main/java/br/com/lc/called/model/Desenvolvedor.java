package br.com.lc.called.model;

import java.util.ArrayList;
import java.util.List;

public class Desenvolvedor extends Pessoa{
	
	
private List<Chamado> chamados = new ArrayList<>();




public Desenvolvedor() {
	super();
}

public Desenvolvedor(Integer id, String login, String senha) {
	super(id, login, senha);
}

public List<Chamado> getChamados() {
	return chamados;
}

public void setChamados(List<Chamado> chamados) {
	this.chamados = chamados;
}




}
