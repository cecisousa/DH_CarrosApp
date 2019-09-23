package com.example.dh_carrosapp.views;


import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dh_carrosapp.R;
import com.example.dh_carrosapp.model.Carro;

import static com.example.dh_carrosapp.views.MenuActivity.SO_KEY;


/**
 * A simple {@link Fragment} subclass.
 */
public class SegundoFragment extends Fragment {
    private ImageView imagem;
    private TextView texto;


    public SegundoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_segundo, container, false);

        initView (view);

        if (!getArguments().isEmpty()){

            Carro carro = getArguments().getParcelable(SO_KEY);

            if (carro != null){
                Drawable drawable = getResources().getDrawable(carro.getImagem());

                imagem.setImageDrawable(drawable);
                texto.setText(carro.getNome());
            }
        }

        return view;

    }

    public void initView(View view){
        imagem = view.findViewById(R.id.imgCarro);
        texto = view.findViewById(R.id.txtCarro);
    }

}
