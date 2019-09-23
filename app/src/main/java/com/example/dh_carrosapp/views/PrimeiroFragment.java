package com.example.dh_carrosapp.views;


import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dh_carrosapp.R;
import com.example.dh_carrosapp.interfaces.Comunicador;
import com.example.dh_carrosapp.model.Carro;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {
    private Button btnCamaro;
    private Button btnFusca;
    private Comunicador comunicador;

    public PrimeiroFragment() {
        // Required empty public constructor
    }

    public void onAttach(@NonNull Context context){
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        initViews(view);

        btnCamaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Carro camaro = new Carro(R.drawable.camaro,"Camaro");
                comunicador.recebeMensagem(camaro);
            }
        });

        btnFusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Carro fusca = new Carro(R.drawable.fusca, "Fusca");
                comunicador.recebeMensagem(fusca);
            }
        });

        return view;

    }

    public void initViews(View view){
        btnCamaro = view.findViewById(R.id.buttonCamaro);
        btnFusca = view.findViewById(R.id.buttonFusca);
    }

}
