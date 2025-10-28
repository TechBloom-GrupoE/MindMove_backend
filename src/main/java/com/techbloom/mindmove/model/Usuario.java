package com.techbloom.mindmove.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 255)
	@Size(min = 3, max = 255, message = "O Nome deve ter no mínimo 3 e no máximo 255 caracteres")
	@NotBlank(message = "O Atributo Nome é obrigatório!")
	private String nome;
	
	@Email(message = "Deve ser inserido um endereço de e-mail válido!")
	@NotBlank(message = "O Atributo Usuario (email) é obrigatório!")
	private String usuario;
	
	@NotNull(message = "O Atributo Data de Nascimento é obrigatório!")
	private LocalDate data_nasc;
	
	@DecimalMin(value = "0.0", inclusive = false, message = "O Atributo Altura deve ser positivo e maior do que zero")
	private BigDecimal altura;
	
	@DecimalMin(value = "0.0", inclusive = false, message = "O Atributo Peso deve ser positivo e maior do que zero")
	private BigDecimal peso;
	
	@NotBlank(message = "O Atributo Perfil Neurodivergente é obrigatório!")
	private String perfil;
	
	@NotBlank(message = "O Atributo Senha é Obrigatório!")
	@Size(min = 8, message = "A Senha deve ter no mínimo 8 caracteres")
	private String senha;
	
	@Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres")
	private String foto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public LocalDate getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}

	public BigDecimal getAltura() {
		return altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	
	
}
