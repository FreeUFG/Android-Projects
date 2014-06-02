package com.bcc_ufg.atlashistologia;

//import com.bcc_ufg.atlashistologia.R;

import com.bcc_ufg.atlashistologia.core.ImageAdapter;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridView;
import android.content.Intent;

public class VisualizarCategoria extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_categoria);
		// Show the Up button in the action bar.
		
		Intent intent = getIntent();
		String categoria = intent.getStringExtra(ListarCategoria.INTENT_CATEGORIA);
		
		getSupportActionBar().setTitle(categoria);
		
		GridView gridView = (GridView) findViewById(R.id.gridView);
		gridView.setAdapter(new ImageAdapter(this));
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
}
