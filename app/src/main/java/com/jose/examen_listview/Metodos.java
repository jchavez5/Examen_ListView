package com.jose.examen_listview;

import android.widget.EditText;

/**
 * Created by android on 16/04/2018.
 */

public class Metodos {
    public static boolean validar(EditText txt, String error, String erro2,String error3) {
        if (txt.getText().toString().equals("")) {
            txt.setError(error);
            return false;
        }
        if (Double.parseDouble(txt.getText().toString()) <= 0) {
            txt.setError(erro2);
            return false;
        }
        if (txt.getText().toString().equals(".")) {
            txt.setError(error3);
            return false;
        }
        return true;
    }


}