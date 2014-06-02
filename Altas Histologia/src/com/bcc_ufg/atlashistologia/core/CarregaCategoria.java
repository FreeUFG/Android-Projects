package com.bcc_ufg.atlashistologia.core;

import java.util.ArrayList;
import java.util.List;

import com.bcc_ufg.atlashistologia.R;

/*
 * Classe CarregaCategoria, responsável por carregar todas as categorias do banco de dados e retornar
 * em forma de lista.
 */
public class CarregaCategoria {

	public static List<Categoria> getCategorias() {
		List<Categoria> categoria = new ArrayList<Categoria>();
		
		categoria.add(new Categoria("Categoria 1", "Breve descrição da categoria", "1 imagem", R.drawable.ic_launcher));
		
		for(int i=2; i<=10; i++) {
			categoria.add(new Categoria("Categoria "+i, "Breve descrição da categoria", i+" imagens", R.drawable.ic_launcher));
		}		
		
		return categoria;
	}
}