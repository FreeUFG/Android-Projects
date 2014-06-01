package com.bcc_ufg.atlashistologia.core;

import java.util.List;

import com.bcc_ufg.atlashistologia.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoriaAdapter extends BaseAdapter {

	private List<Categoria> categoria;
	
	public CategoriaAdapter(List<Categoria> categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public int getCount() {
		return categoria.size();
	}
	
	@Override
	public Object getItem(int position) {
		return categoria.get(position);		
	}
	
	@Override
	public long getItemId(int id) {
		return id;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Context context = parent.getContext();
		
		Categoria categoria = (Categoria) getItem(position);
		
		ViewHolder holder;
		
		if(convertView == null) {
			 convertView = LayoutInflater.from(context).inflate(R.layout.item_categoria_layout, null);
			   
		      holder = new ViewHolder();
		      holder.imgCategoria = (ImageView) convertView.findViewById(R.id.iconeCategoria);
		      holder.tituloCategoria = (TextView) convertView.findViewById(R.id.tituloCategoria);   
		      holder.descricaoCategoria = (TextView) convertView.findViewById(R.id.descricaoCategoria);
		      holder.qtdImagens = (TextView) convertView.findViewById(R.id.qtdImagens);
		   
		      convertView.setTag(holder);
		} else {
		      holder = (ViewHolder) convertView.getTag();
		}
		
		holder.imgCategoria.setImageResource(categoria.getIcone());
		holder.tituloCategoria.setText(categoria.getNomeCategoria());
		holder.descricaoCategoria.setText(categoria.getDescricao());
		holder.qtdImagens.setText(categoria.getQtdImagem());
		
		return convertView;
	}
	
	static class ViewHolder {
	    ImageView imgCategoria;
	    TextView tituloCategoria;
	    TextView descricaoCategoria;
	    TextView qtdImagens;
	}
}
