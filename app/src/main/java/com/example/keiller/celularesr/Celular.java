package com.example.keiller.celularesr;

/**
 * Created by keiller on 16/04/2018.
 */

public class Celular {
    private int marca;
    private int color;
    private int sistema;
    private double RAM;
    private double precio;

    public Celular(int marca, int color, int sistema, double RAM, double precio) {
        this.marca = marca;
        this.color = color;
        this.sistema = sistema;
        this.RAM = RAM;
        this.precio = precio;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSistema() {
        return sistema;
    }

    public void setSistema(int sistema) {
        this.sistema = sistema;
    }

    public double getRAM() {
        return RAM;
    }

    public void setRAM(double RAM) {
        this.RAM = RAM;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void guardar(){
        Datos.guardarCelulares(this);
    }
}

