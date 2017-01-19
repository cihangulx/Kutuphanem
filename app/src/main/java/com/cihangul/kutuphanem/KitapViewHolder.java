package com.cihangul.kutuphanem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/*
 * Created by Cihan on 18.11.2016.
 */

public class KitapViewHolder extends RecyclerView.ViewHolder {

    TextView kitapIsmi;
    TextView kitapYazari;
    TextView kitapBasimYili;
    TextView kitapYayinEvi;
    ImageView kitapResmi;
    // View Tanımlamaları


    public KitapViewHolder(View view) {
        super(view);
        //View Eşitlemeleri
        kitapIsmi=(TextView)view.findViewById(R.id.kitap_ismi);
        kitapYazari=(TextView)view.findViewById(R.id.kitap_yazari);
        kitapBasimYili=(TextView)view.findViewById(R.id.kitap_basim_yili);
        kitapYayinEvi=(TextView)view.findViewById(R.id.kitap_yayinevi);
        kitapResmi=(ImageView)view.findViewById(R.id.kitap_resmi);
    }

}
