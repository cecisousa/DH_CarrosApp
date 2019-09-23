package com.example.dh_carrosapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dh_carrosapp.R;
import com.google.android.material.textfield.TextInputLayout;

public class CadastroActivity extends AppCompatActivity {
    private TextInputLayout txtNome;
    private TextInputLayout txtEmail;
    private TextInputLayout txtSenha;
    private Button btnEntrar;

    public static final String NAME_KEY = "nome";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txtNome = findViewById(R.id.textInputLayout);
        txtEmail = findViewById(R.id.textInputLayout2);
        txtSenha = findViewById(R.id.textInputLayout3);
        btnEntrar = findViewById(R.id.button);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome =  txtNome.getEditText().getText().toString();
                String email =  txtEmail.getEditText().getText().toString();
                String senha =  txtSenha.getEditText().getText().toString();

                if (!nome.isEmpty() && !email.isEmpty() && !senha.isEmpty()){
                    Intent intent = new Intent(CadastroActivity.this, BoasVindasActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString(NAME_KEY, nome);
                    intent.putExtras(bundle);
                    startActivity(intent);
                } else if (nome.isEmpty()){
                    txtNome.setError("O campo nome deve ser preenchido!");
                } else if (email.isEmpty()){
                    txtEmail.setError("O campo e-mail deve ser preenchido");
                } else {
                    txtSenha.setError("O campo senha deve ser preenchido!");
                }
            }
        });


    }

}
