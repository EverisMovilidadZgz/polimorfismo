package victordev.es.polimorfismo.clases;

import victordev.es.polimorfismo.interfaces.AveJavaInterface;

public class PolloCamperoJava implements AveJavaInterface{
    public static final String MENSAJE_PONER_HUEVOS = "El pollo campero se ha puesto a poner huevos cómo loco";
    public static final String MENSAJE_COMER_MAIZ = "El pollo campero se ha puesto a comer maíz cómo si no existiera un mañana";
    public static final String MENSAJE_ALTURA_VUELO = "5m";
    public static final String MENSAJE_SONIDO = "PIO!! PIO!!";

    public String ponerHuevos() {
        return MENSAJE_PONER_HUEVOS;
    }

    public String comerMaiz() {
        return MENSAJE_COMER_MAIZ;
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
