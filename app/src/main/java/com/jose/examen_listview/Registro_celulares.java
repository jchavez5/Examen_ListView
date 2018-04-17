package com.jose.examen_listview;

/**
 * Created by android on 16/04/2018.
 */

public class Registro_celulares {
    private String marca;
    private String color;
    private double precio;

    public Registro_celulares(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void guardar(){Dato.guardar(this);}
}
