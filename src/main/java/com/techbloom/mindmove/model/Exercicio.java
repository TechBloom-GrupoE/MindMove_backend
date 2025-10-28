package com.techbloom.mindmove.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Exercicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 100)
    @Size(min=5, max=100, message="A Decrição deve conter no mínimo 05 e no máximo 100 caracteres")
	@NotBlank(message = "O Nome é Obrigatório!")
	private String nome;
	
	@Column(length = 500)
    @Size(min=5, max=500, message="A Decrição deve conter no mínimo 05 e no máximo 500 caracteres")
	@NotBlank(message = "A Descrição é Obrigatória!")
    private String descricao;
	
    @Min(value = 1, message = "A duração mínima deve ser de 1 minuto.")
	@NotBlank(message = "A Duração é Obrigatória!")
	private Integer duracao;
	
	@Pattern(regexp = "Baixo|Médio|Alto", message = "O nível de estímulo sensorial deve ser Baixo, Médio ou Alto.")
	@NotBlank(message = "O Estímulo Sensorial é Obrigatório!")
	private String estimuloSensorial;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public void setDuracao(Integer duracao) {
		this.duracao = duracao;
	}

	public String getEstimuloSensorial() {
		return estimuloSensorial;
	}

	public void setEstimuloSensorial(String estimuloSensorial) {
		this.estimuloSensorial = estimuloSensorial;
	}
	

}