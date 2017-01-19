package com.cihangul.kutuphanem.Fragmentler;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cihangul.kutuphanem.Kitap;
import com.cihangul.kutuphanem.KitapAdapter;
import com.cihangul.kutuphanem.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cihan on 18.11.2016.
 */

public class BilimFragment extends Fragment {
    RecyclerView recyclerView;
    List<Kitap> kitapList;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.bilim_fragment,container,false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        recyclerView=(RecyclerView)view.findViewById(R.id.bilim_recyclerview);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        kitapList=new ArrayList<>();
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        kitapList.add(new Kitap("Cihan","Gül","Samsun","1993",R.drawable.ic_menu_gallery));
        KitapAdapter kitapAdapter =new KitapAdapter(kitapList);
        recyclerView.setAdapter(kitapAdapter);

        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

}
