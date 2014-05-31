package com.bcc_ufg.atlashistologia;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class VisualizarCategoria extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_categoria);
		// Show the Up button in the action bar.
	}
	
	public void activityVisualizarImagem(View view) {
		Intent intent = new Intent(this, VisualizarImagem.class);
		startActivity(intent);
	}
}
