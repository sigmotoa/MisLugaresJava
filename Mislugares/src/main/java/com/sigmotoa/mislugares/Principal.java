package com.sigmotoa.mislugares;

/**
 * Created by sigmotoa on 21/01/18.
 */

public class Principal {

    public static void main(String[] args) {
        Lugar lugar =new Lugar(-0.166093,38.995656,TipoLugar.EDUCACION,
                "Escuela Politecnica Superior de Gandías",
                "C/ Paranimfe, 1 46730 Gandía (SPAIN)",
                "http://www.epsg.upv.es","Uno de los mejores Lugares",
                962284930,3);
        System.out.println("Lugar "+lugar.toString());
    }
}
