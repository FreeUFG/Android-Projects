package com.bcc_ufg.atlashistologia;

import com.bcc_ufg.atlashistologia.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class ListarCategoria extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listar_categoria);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listar_categoria, menu);
		return true;
	}
	
	public void activityVisualizarCategoria(View view) {
		Intent intent = new Intent(this, VisualizarCategoria.class);
		startActivity(intent);
	}
	
}
