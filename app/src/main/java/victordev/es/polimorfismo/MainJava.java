package victordev.es.polimorfismo;

import android.util.Log;

import victordev.es.polimorfismo.clases.PichonTitanicoYmecanicoJava;
import victordev.es.polimorfismo.clases.PolloCamperoJava;
import victordev.es.polimorfismo.interfaces.AveJavaInterface;

public class MainJava {
    private AveJavaInterface[] listadoAvesJava;

    public void run() {
        listadoAvesJava = new AveJavaInterface[2];
        llenarLista();

        for (AveJavaInterface ave : listadoAvesJava) {
            if (ave instanceof PolloCamperoJava) {
                //MÉTODOS COMUNES DE LA INTERFAZ SE PODRÍAN HABER LLAMADO FUERA DEL BUCLE
                Log.d(MainJava.class.getName(), ave.obtenerAlturaVuelo());
                Log.d(MainJava.class.getName(),ave.sonido());
                //MÉTODOS DE LA CLASE
                Log.d(MainJava.class.getName(),((PolloCamperoJava) ave).comerMaiz());
                Log.d(MainJava.class.getName(),((PolloCamperoJava) ave).ponerHuevos());

            } else if (ave instanceof PichonTitanicoYmecanicoJava) {
                //MÉTODOS COMUNES DE LA INTERFAZ SE PODRÍAN HABER LLAMADO FUERA DEL BUCLE
                Log.d(MainJava.class.getName(),ave.obtenerAlturaVuelo());
                Log.d(MainJava.class.getName(),ave.sonido());
                //MÉTODO DE LA CLASE
                Log.d(MainJava.class.getName(),((PichonTitanicoYmecanicoJava) ave).disparar());
            }
        }
    }

    private void llenarLista() {
        listadoAvesJava[0] = new PichonTitanicoYmecanicoJava();
        listadoAvesJava[1] = new PolloCamperoJava();
    }
}
