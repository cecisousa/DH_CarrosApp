package com.example.dh_carrosapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dh_carrosapp.R;
import com.google.android.material.snackbar.Snackbar;

import static com.example.dh_carrosapp.views.CadastroActivity.NAME_KEY;

public class BoasVindasActivity extends AppCompatActivity {
    private TextView txt1;
    private TextView txt2;
    private Button btnVamos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boas_vindas);

        txt1 = findViewById(R.id.textView);
        txt2 = findViewById(R.id.textView2);
        btnVamos = findViewById(R.id.button2);

        Intent intent = getIntent();

        if (getIntent() != null && intent.getExtras() != null){
            Bundle bundle = intent.getExtras();
            String nome = bundle.getString(NAME_KEY);
            txt1.setText("Seja bem-vindo(a), " + nome + "!");
        } else {
            Snackbar.make(txt1,"Não há dados!", Snackbar.LENGTH_LONG).show();
        }

        btnVamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BoasVindasActivity.this, MenuActivity.class));
            }
        });








    }
}
