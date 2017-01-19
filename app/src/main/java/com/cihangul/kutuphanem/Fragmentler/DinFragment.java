package com.cihangul.kutuphanem.Fragmentler;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cihangul.kutuphanem.R;

/**
 * Created by Cihan on 18.11.2016.
 */

public class DinFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.din_fragment,container,false);
        return view;
    }
}
