package com.example.gabbercore.pruebat2_rubenescribano;

/**
 * Created by GABBERCORE on 06/03/2018.
 */
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);

        TextView myTitle = (TextView)findViewById(R.id.tv_title);
        ImageView myImage = (ImageView)findViewById(R.id.iv_fox);

        //insertamos una fuente
        //Typeface myFont = Typeface.createFromAsset(getAssets(),"amatic_regular.ttf");
        //a este text metemos la fuente (da error)
        //myTitle.setTypeface(myFont);

        //insertamos animacion
        //en la carpeta res/anim(creada)/hacemos el xml fadein en este caso
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation myanimrotate = AnimationUtils.loadAnimation(this,R.anim.rotation);

        //asignamos a esa imagen la animación por parámetros
        myImage.startAnimation(myanim);
        myTitle.startAnimation(myanimrotate);

        abrirApp(true);

    }

    private void abrirApp(boolean locationPermission){

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MySplash.this, MyLogin.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }

}
