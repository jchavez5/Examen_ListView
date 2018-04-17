package com.jose.examen_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Reporte4 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Registro_celulares> registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte4);
        tabla=findViewById(R.id.idReporte4);
        registro=Dato.obtener();

    }

    public void reporte4(View v){
        int conteo=0;
        String negro=getResources().getString(R.string.negro);
        for (int i = 0; i <registro.size() ; i++) {
            if (registro.get(i).getMarca().toString().equals("Apple")&&
                    registro.get(i).getColor().toString().equals(negro)){
                conteo=conteo+1;

            }
            Toast.makeText(getApplicationContext(),""+conteo,Toast.LENGTH_SHORT).show();
        }
    }
}
