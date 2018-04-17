package com.jose.examen_listview;

import java.util.ArrayList;

/**
 * Created by android on 16/04/2018.
 */

public class Dato {
    private static ArrayList<Registro_celulares> celular = new ArrayList<>();
    public static void guardar (Registro_celulares p){celular.add(p);    }
    public static ArrayList<Registro_celulares> obtener (){
        return celular;
    }
}
