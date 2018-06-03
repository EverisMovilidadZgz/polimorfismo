package victordev.es.polimorfismo.clases;

import victordev.es.polimorfismo.interfaces.AveJavaInterface;

public class PichonTitanicoYmecanicoJava implements AveJavaInterface{
    public static final int DISPAROS_POR_DEFECTO = 2;
    public static final String MENSAJE_ALTURA_VUELO = "20000m";
    public static final String MENSAJE_SONIDO = "IIINGGGG!! GRIINNGG!!";


    public String disparar() {
        return "Se han disparados " + String.valueOf(DISPAROS_POR_DEFECTO) + " misiles titánicos";
    }

    @Override
    public String obtenerAlturaVuelo() {
        return MENSAJE_ALTURA_VUELO;
    }

    @Override
    public String sonido() {
        return MENSAJE_SONIDO;
    }
}
