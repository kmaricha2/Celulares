package com.example.keiller.celularesr;

/**
 * Created by keiller on 16/04/2018.
 */

import java.util.ArrayList;

public class Datos {
    private static ArrayList<Celular> celulares = new ArrayList();

    public static void guardarCelulares(Celular c){
        celulares.add(c);
    }

    public static ArrayList<Celular> obtenerCelulares(){
        return celulares;
    }
}
