package br.ufrn.eaj.tads.pigmanager.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.ufrn.eaj.tads.pigmanager.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListarPigFragment extends Fragment {



    public ListarPigFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        Log.i("VDC", "ENTROU NA TELA DE LISTAR");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listar_pig, container, false);
    }

}
