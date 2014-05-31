package com.bcc_ufg.atlashistologia;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class VisualizarHistorico extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visualizar_historico);
		// Show the Up button in the action bar.
	}

	public void activityFazerAnotacoes(View view) {
		Intent intent = new Intent(this, FazerAnotacoes.class);
		startActivity(intent);
	}
}
