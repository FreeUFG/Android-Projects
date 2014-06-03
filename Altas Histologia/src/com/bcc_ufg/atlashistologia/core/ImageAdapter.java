package com.bcc_ufg.atlashistologia.core;

import com.bcc_ufg.atlashistologia.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.GridView;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;
	private int width;
	
	public ImageAdapter(Context c, int width) {
		mContext = c;
		this.width = width;
	}
	
	public int getCount() {
		return mThumbsIds.length;
	}
	
	public Object getItem(int position) {
		return null;
	}
	
	public int getItemPosition(int position) {
		return mThumbsIds[position];
	}
	
	public long getItemId(int position) {
		return 0;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if(convertView == null) {
			imageView = new ImageView(mContext);	
			
			if(width >= 320) {
				imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
			} else {
				imageView.setLayoutParams(new GridView.LayoutParams(115, 115));
			}
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(0,0,0,0);
		} else {
			imageView = (ImageView) convertView;
		}
		
		imageView.setImageResource(mThumbsIds[position]);
		return imageView;
	}
	
	private int[] mThumbsIds = {
			R.drawable.sample_0, R.drawable.sample_3,
			R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7,
			R.drawable.sample_0, R.drawable.sample_1,
			R.drawable.sample_2, R.drawable.sample_3,
			R.drawable.sample_4, R.drawable.sample_5,
			R.drawable.sample_6, R.drawable.sample_7,
			R.drawable.sample_0, R.drawable.sample_1
	};
}
