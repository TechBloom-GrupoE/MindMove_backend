package com.techbloom.mindmove.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "A descrição é obrigatória!")
    private String descricao; // Ex: Respiração, Foco, Relaxamento, Movimento Ativo

    @NotBlank(message = "O ícone é obrigatório!")
    @Size(max = 5000, message = "O link do ícone deve ter no máximo 5000 caracteres")
    private String icone;

    @NotBlank(message = "O perfil recomendado é obrigatório!")
    private String perfilRelacionado; // Ex: TDAH, Autismo, Ansiedade, TOD, etc.

    public Categoria() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public String getPerfilRelacionado() {
		return perfilRelacionado;
	}

	public void setPerfilRelacionado(String perfilRelacionado) {
		this.perfilRelacionado = perfilRelacionado;
	}

}