package com.example.dh_carrosapp.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.dh_carrosapp.R;
import com.example.dh_carrosapp.interfaces.Comunicador;
import com.example.dh_carrosapp.model.Carro;

public class MenuActivity extends AppCompatActivity implements Comunicador {
    public static final String SO_KEY = "SO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        replaceFragment(R.id.container2, new PrimeiroFragment());
    }

    @Override
    public void recebeMensagem(Carro carro) {
        setBundleToFragment(carro, SO_KEY);
    }

    private void replaceFragment(int container, Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();

    }

    public void setBundleToFragment(Carro so, String CHAVE){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAVE, so);

        Fragment segundoFragment = new SegundoFragment();
        segundoFragment.setArguments(bundle);

        replaceFragment(R.id.container1, segundoFragment);

    }


}
