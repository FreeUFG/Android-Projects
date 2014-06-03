package com.bcc_ufg.atlashistologia;

import com.bcc_ufg.atlashistologia.R;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class VisualizarImagem extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_imagem);
		// Show the Up button in the action bar.	
		Intent intent = getIntent();
		
		String nomeImagem = intent.getStringExtra(VisualizarCategoria.INTENT_NOME_IMAGEM);		
		String descricaoImagem = intent.getStringExtra(VisualizarCategoria.INTENT_DESCRICAO_IMAGEM);
		int imagem = intent.getIntExtra(VisualizarCategoria.INTENT_IMAGEM, 0);
		
		TextView textView = (TextView) findViewById(R.id.descricao);
		textView.setText(descricaoImagem);
		
		ImageView imageView = (ImageView) findViewById(R.id.imageView);
		imageView.setImageResource(imagem);		
		
		getSupportActionBar().setTitle(nomeImagem);
		getSupportActionBar().setHomeButtonEnabled(true);
	}
	
}
