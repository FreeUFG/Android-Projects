package com.bcc_ufg.atlashistologia;

//import com.bcc_ufg.atlashistologia.R;

import com.bcc_ufg.atlashistologia.core.ImageAdapter;
import com.bcc_ufg.atlashistologia.core.Imagem;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.AdapterView.OnItemClickListener;
import android.view.Display;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.content.Intent;
import android.view.WindowManager;

public class VisualizarCategoria extends ActionBarActivity implements OnItemClickListener {

	public final static String INTENT_IMAGEM = "com.bcc_ufg.atlashistologia.IMAGEM";
	public final static String INTENT_DESCRICAO_IMAGEM = "com.bcc_ufg.atlashistologia.DESCRICAO_IMAGEM";
	public final static String INTENT_NOME_IMAGEM = "com.bcc_ufg.atlashistologia.NOME_IMAGEM";	
	
	private GridView gridView;
	private ImageAdapter imageAdapter;
	private String titleActionBar = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_categoria);
		// Show the Up button in the action bar.
		
		Intent intent = getIntent();
		titleActionBar = intent.getStringExtra(ListarCategoria.INTENT_CATEGORIA);
		
		getSupportActionBar().setTitle(titleActionBar);
		
		gridView = (GridView) findViewById(R.id.gridView);
		Display display = ((WindowManager) getSystemService(this.WINDOW_SERVICE)).getDefaultDisplay();
		imageAdapter = new ImageAdapter(this, display.getWidth());
		gridView.setAdapter(imageAdapter);

		gridView.setOnItemClickListener(this);
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
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        //Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
		
		Imagem imagem = new Imagem();
		imagem.setNomeImagem("Imagem "+position);
		imagem.setDescricao("Descrição da imagem "+position);
		imagem.setImagem(imageAdapter.getItemPosition(position));
		
		Intent intent = new Intent(this, VisualizarImagem.class);
		intent.putExtra(INTENT_NOME_IMAGEM, imagem.getNomeImagem());
		intent.putExtra(INTENT_DESCRICAO_IMAGEM, imagem.getDescricao());		
		intent.putExtra(INTENT_IMAGEM, imagem.getImagem());
		startActivity(intent);
    }
}
