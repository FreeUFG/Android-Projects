package com.bcc_ufg.atlashistologia;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class VisualizarImagem extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_imagem);
		// Show the Up button in the action bar.
	}

	public void activityVisualizarHistorico(View view) {
		Intent intent = new Intent(this, VisualizarHistorico.class);
		startActivity(intent);
	}
}
