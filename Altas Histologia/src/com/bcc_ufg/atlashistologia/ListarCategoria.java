package com.bcc_ufg.atlashistologia;

import com.bcc_ufg.atlashistologia.R;
import com.bcc_ufg.atlashistologia.core.CarregaCategoria;
import com.bcc_ufg.atlashistologia.core.CategoriaAdapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

public class ListarCategoria extends ActionBarActivity {

	private ListView listaCategoria;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar_categoria);
		
		getSupportActionBar().setTitle("Atlas Histologia");
		
		listaCategoria = (ListView) findViewById(R.id.listaCategoria);
		
		listaCategoria.setAdapter(new CategoriaAdapter(CarregaCategoria.getCategorias()));
	}
	
}
