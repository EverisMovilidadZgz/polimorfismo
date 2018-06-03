package victordev.es.polimorfismo;

import victordev.es.polimorfismo.clases.PichonTitanicoYmecanicoJava;
import victordev.es.polimorfismo.clases.PolloCamperoJava;
import victordev.es.polimorfismo.interfaces.AveJavaInterface;

public class MainJava {
    private AveJavaInterface[] listadoAvesJava;

    public void run() {
        AveJavaInterface[] listadoAvesJava = new AveJavaInterface[2];
        llenarLista();

        for (AveJavaInterface ave : listadoAvesJava) {
            if (ave instanceof PolloCamperoJava) {
                //MÉTODOS COMUNES DE LA INTERFAZ SE PODRÍAN HABER LLAMADO FUERA DEL BUCLE
                ave.obtenerAlturaVuelo();
                ave.sonido();
                //MÉTODOS DE LA CLASE
                ((PolloCamperoJava) ave).comerMaiz();
                ((PolloCamperoJava) ave).ponerHuevos();

            } else if (ave instanceof PichonTitanicoYmecanicoJava) {
                //MÉTODOS COMUNES DE LA INTERFAZ SE PODRÍAN HABER LLAMADO FUERA DEL BUCLE
                ave.obtenerAlturaVuelo();
                ave.sonido();
                //MÉTODO DE LA CLASE
                ((PichonTitanicoYmecanicoJava) ave).disparar();
            }
        }
    }

    private void llenarLista() {
        listadoAvesJava[0] = new PichonTitanicoYmecanicoJava();
        listadoAvesJava[1] = new PolloCamperoJava();
    }
}
