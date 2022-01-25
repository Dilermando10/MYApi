package com.dilermando.myapi.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message =" Campo NOME é mandadório")
	@Length(min = 3, max = 100, message ="O nome Deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message =" Campo LOGIN é mandadório")
	@Length(min = 3, max = 100, message ="O login Deve ter entre 3 e 100 caracteres")
	private String login;
	
	@NotEmpty(message =" Campo SENHA é mandadório")
	@Length(min = 3, max = 100, message ="A senhae Deve ter entre 3 e 100 caracteres")
	private String senha;

	public Usuario() {
		super();

	}

	public Usuario(Integer id, String nome, String login, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, login, nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id) && Objects.equals(login, other.login) && Objects.equals(nome, other.nome)
				&& Objects.equals(senha, other.senha);
	}

}
