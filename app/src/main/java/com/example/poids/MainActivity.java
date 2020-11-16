package com.example.poids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //les attributs
    private Button bCalculer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.bCalculer= (Button) this.findViewById(R.id.boutonCalculer)
        ;
        this.bCalculer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText tailleView =(EditText) findViewById(R.id.taille);
                String taille= tailleView.getText().toString();
                Float poidIdeal = (3*Float.parseFloat(taille)-250)/4 ;

                Context context = getApplicationContext();
                CharSequence text = "votre poid ideal est "+poidIdeal+"Kg";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

            }
        });


    }



}
