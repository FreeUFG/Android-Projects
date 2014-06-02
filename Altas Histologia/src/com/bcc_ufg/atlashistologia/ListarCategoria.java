package com.bcc_ufg.atlashistologia;

import com.bcc_ufg.atlashistologia.R;
import com.bcc_ufg.atlashistologia.core.CarregaCategoria;
import com.bcc_ufg.atlashistologia.core.Categoria;
import com.bcc_ufg.atlashistologia.core.CategoriaAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.AdapterView.OnItemClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/*
 * Classe ListarCategoria, responsável por carregar as categorias cadastradas no banco de dados,
 * adaptá-las para ListView e mostra-las na tela.
 */
public class ListarCategoria extends ActionBarActivity implements OnItemClickListener {

	public final static String INTENT_CATEGORIA = "com.bcc_ufg.atlashistologia.CATEGORIA";
	
	private ListView listaCategoria;
	private CategoriaAdapter categoriaAdapter;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar_categoria);
		
		// Titulo da ActionBar
		getSupportActionBar().setTitle(R.string.action_bar_title);
		
		listaCategoria = (ListView) findViewById(R.id.listaCategoria);
		
		categoriaAdapter = new CategoriaAdapter(CarregaCategoria.getCategorias());
		listaCategoria.setAdapter(categoriaAdapter);
		
		listaCategoria.setOnItemClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.action_bar_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	/* Implementação da action das options da ActionBar */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
			case R.id.action_search:
				// Chama metodo de busca
				return true;
			default:
				return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, VisualizarCategoria.class);
		Categoria c = (Categoria) categoriaAdapter.getItem(arg2);		
		intent.putExtra(INTENT_CATEGORIA, c.getNomeCategoria());
		startActivity(intent);
	}
}
