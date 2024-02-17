package br.com.lc.called.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.lc.called.model.enums.UserRole;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String nome;
	protected String login;
	protected String senha;
	
	protected Set<Integer> role = new HashSet<>();
	
	protected LocalDate dataCriacao = LocalDate.now();

	public Pessoa() {
		super();
		addRole(UserRole.USUARIO);
	}

	public Pessoa(Integer id, String login, String senha) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		addRole(UserRole.USUARIO);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Set<UserRole> getRole() {
		return role.stream().map(x -> UserRole.toEnum(x)).collect(Collectors.toSet());
	}

	public void addRole(UserRole role) {
		this.role.add(role.getCod());
	}
	
	
	
	
	
	
	
	
	
}
