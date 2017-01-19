package com.cihangul.kutuphanem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/*
 * Created by Cihan on 19.11.2016.
 */

public class KitapAdapter extends RecyclerView.Adapter<KitapViewHolder> {

    List<Kitap> kitapList;
   public KitapAdapter(List<Kitap> kitapList){
        this.kitapList=kitapList;
    }

    @Override
    public KitapViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);

        KitapViewHolder kitapViewHolder = new KitapViewHolder(view);

        return kitapViewHolder;
    }

    @Override
    public void onBindViewHolder(KitapViewHolder holder, int position) {
        ///Eşitlemeler

        holder.kitapResmi.setImageResource(kitapList.get(position).getKitapResmi());
        holder.kitapIsmi.setText(kitapList.get(position).getKitapIsmi());
        holder.kitapYazari.setText(kitapList.get(position).getKitapYazari());
        holder.kitapYayinEvi.setText(kitapList.get(position).getKitapYayinEvi());
        holder.kitapBasimYili.setText(kitapList.get(position).getKitapBasimYili());
    }

    @Override
    public int getItemCount() {
        return kitapList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
