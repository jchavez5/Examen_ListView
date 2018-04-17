package com.jose.examen_listview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Celular extends AppCompatActivity {
    private Spinner marca_spinner,color_spinner;
    private String marca[],color[];
    private Resources recursos;
    private EditText txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);

        recursos=this.getResources();
        marca_spinner=findViewById(R.id.id_marca);
        color_spinner=findViewById(R.id.id_color);

        marca=recursos.getStringArray(R.array.marca_celular);
        ArrayAdapter<String> adapter1= new ArrayAdapter(this,android.R.layout.simple_spinner_item,marca);
        marca_spinner.setAdapter(adapter1);

        color=recursos.getStringArray(R.array.color_celular);
        ArrayAdapter<String> adapter2= new ArrayAdapter(this,android.R.layout.simple_spinner_item,color);
        color_spinner.setAdapter(adapter2);

        

    }
}
