package com.bcc_ufg.atlashistologia.core;

public class Imagem {

	private String nomeImagem;
	private String descricao;
	private int imagem;
	
	public Imagem() {
		
	}
	
	public Imagem(String nomeImagem, String descricao, int imagem) {
		this.nomeImagem = nomeImagem;
		this.descricao = descricao;
		this.imagem = imagem;
	}
	
	public void setNomeImagem(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}
	
	public String getNomeImagem() {
		return nomeImagem;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setImagem(int imagem) {
		this.imagem = imagem;
	}
	
	public int getImagem() {
		return imagem;
	}
	
}
