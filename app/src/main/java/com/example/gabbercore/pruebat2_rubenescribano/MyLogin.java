package com.example.gabbercore.pruebat2_rubenescribano;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by GABBERCORE on 06/03/2018.
 */

public class MyLogin extends AppCompatActivity {

    protected Button boton_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);

        boton_login = (Button) findViewById(R.id.bt_login);
        boton_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyLogin.this, MyMain.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().hide();
    }
}