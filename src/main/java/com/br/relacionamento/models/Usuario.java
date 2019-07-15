package com.br.relacionamento.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotBlank(message = "Nao pode ficar em branco")
	@Size(min = 2, message = "tem que ter no minimo 2 caractere")
	private String nome;

	@NotBlank(message = "Nao pode ficar em branco")
	@Size(min = 4, message = "tem que ter no minimo 4 caractere")
	private String sobrenome;
	
	@NotBlank(message = "Nao pode ficar em branco")
	@Email(message = "Email invalido")
	private String email;

	@OneToOne(mappedBy = "usuario")
	private Login login;

	public Usuario() {

	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
