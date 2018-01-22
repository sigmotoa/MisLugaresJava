package com.sigmotoa.mislugares;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sigmotoa on 22/01/18.
 */

public class LugaresVector implements Lugares {

    protected List <Lugar> vectorLugares=ejemploLugares();


    public LugaresVector(){
        vectorLugares = ejemploLugares();
    }

    public Lugar elemento(int id)
    {
        return vectorLugares.get(id);
    }

    public void anyade (Lugar lugar){
        vectorLugares.add(lugar);
    }

    public int nuevo() {
        Lugar lugar =new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }

    public void borrar(int id) {
    vectorLugares.remove(id);
    }

    public int tamanyo() {
        return vectorLugares.size();
    }

    public void actualiza(int id, Lugar lugar) {
        vectorLugares.set(id,lugar);
    }



public static ArrayList<Lugar>ejemploLugares(){

        ArrayList<Lugar>lugares=new ArrayList<Lugar>();
        lugares.add(new Lugar(-0.166093,38.995656,TipoLugar.EDUCACION,
               "Escuela Politecnica Superior de Gandia",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)","www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.",5461600,3));

        lugares.add(new Lugar(-0.190642,38.925857,TipoLugar.BAR,
            "Al de siempre",
            "Parque Industrial Junto Molì Nou, Benifla (Valencia)","",
            "No te pierdas el arroz en calabaza.",5403249,3));
        lugares.add(new Lugar(0.0,0.0,TipoLugar.EDUCACION,
            "androidcurso.com",
            "ciberespacio","www.androidcurso.com",
            "Muchas cosas android.",3838001,5));
        return lugares;


}


}
