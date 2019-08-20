package br.ici.treinamento.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);

                Usuario usuario = new Usuario("Curso","curso@curso.com.br");

                intent.putExtra("nome","Jean Christian");
                intent.putExtra("idade",28);
                intent.putExtra("objeto",usuario);

                startActivity(intent);

            }
        });
    }
}
