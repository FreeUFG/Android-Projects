package com.bcc_ufg.atlashistologia.core;

import java.util.ArrayList;
import java.util.List;

import android.R;

public class CarregaCategoria {

	public static List<Categoria> getCategorias() {
		List<Categoria> categoria = new ArrayList<Categoria>();
		
		categoria.add(new Categoria("Categoria 1", "Breve descri��o da categoria", "1 imagem", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 2", "Breve descri��o da categoria", "2 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 3", "Breve descri��o da categoria", "3 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 4", "Breve descri��o da categoria", "4 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 5", "Breve descri��o da categoria", "5 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 6", "Breve descri��o da categoria", "6 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 7", "Breve descri��o da categoria", "7 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 8", "Breve descri��o da categoria", "8 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 9", "Breve descri��o da categoria", "9 imagens", R.drawable.ic_search_category_default));
		categoria.add(new Categoria("Categoria 10", "Breve descri��o da categoria", "10 imagens", R.drawable.ic_search_category_default));
		
		return categoria;
	}
}