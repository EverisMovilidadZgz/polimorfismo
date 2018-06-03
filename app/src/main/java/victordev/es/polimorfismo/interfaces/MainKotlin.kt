package victordev.es.polimorfismo.interfaces

import victordev.es.polimorfismo.clases.PichonTitanicoYmecanicoKotlin
import victordev.es.polimorfismo.clases.PolloCamperoKotlin

class MainKotlin {
    lateinit var listadoAvesKotlin: Array<AveKotlinInterface>

    fun run() {
        llenarLista()

        for (ave in listadoAvesKotlin) {
            //MÉTODOS COMUNES DE LA INTERFAZ SE PODRÍAN HABER LLAMADO FUERA DEL BUCLE
            ave.sonido();
            ave.obtenerAlturaVuelo()
            if (ave is PolloCamperoKotlin) {
                //MÉTODOS DE LA CLASE
                with(PolloCamperoKotlin) {
                    ave.comerMaiz()
                    ave.ponerHuevos()
                }
            } else if (ave is PichonTitanicoYmecanicoKotlin) {
                //MÉTODOS DE LA CLASE
                with(PichonTitanicoYmecanicoKotlin) {
                    ave.disparar()
                }
            }
        }
    }

    fun llenarLista() {
        listadoAvesKotlin.plus(PolloCamperoKotlin())
        listadoAvesKotlin.plus(PichonTitanicoYmecanicoKotlin())
    }
}