package com.jose.examen_listview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Celular extends AppCompatActivity {
    private Spinner marca_spinner,color_spinner;
    private String marca[],color[];
    private Resources recursos;
    private EditText txtValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celular);
        txtValor=findViewById(R.id.id_precio);

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
    public void crear(View v){
        int posicion_marca=marca_spinner.getSelectedItemPosition();
        int posicion_color=color_spinner.getSelectedItemPosition();
        String marcaSelec=marca[posicion_marca];
        String colorSelec=color[posicion_color];
        double precio=Double.parseDouble(txtValor.getText().toString());

        Registro_celulares r=new Registro_celulares(marcaSelec,colorSelec,precio);
        r.guardar();
        Toast.makeText(getApplicationContext(),getString(R.string.registro_guardado),Toast.LENGTH_SHORT).show();

    }
    public void limpiar(View v){
        txtValor.setText("");
    }
}
