package com.bcc_ufg.atlashistologia.core;

public class Categoria {

	public String nomeCategoria;
	public String descricao;
	public String qtdImagem;
	public int icone;
	
	public Categoria(String nomeCategoria, String descricao, String qtdImagem, int icone) {
		this.nomeCategoria = nomeCategoria;
		this.descricao = descricao;
		this.qtdImagem = qtdImagem;
		this.icone = icone;
	}
	
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setQtdImagem(String qtdImagem) {
		this.qtdImagem = qtdImagem;
	}
	
	public String getQtdImagem() {
		return qtdImagem;
	}
	
	public void setIcone(int icone) {
		this.icone = icone;
	}
	
	public int getIcone() {
		return icone;
	}
	
}