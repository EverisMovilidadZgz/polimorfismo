package victordev.es.polimorfismo.interfaces

import android.util.Log
import victordev.es.polimorfismo.clases.PichonTitanicoYmecanicoKotlin
import victordev.es.polimorfismo.clases.PolloCamperoKotlin

class MainKotlin {
    val listadoAvesKotlin = mutableListOf<AveKotlinInterface>()

    fun run() {
        llenarLista()

        for (ave in listadoAvesKotlin) {
            //MÉTODOS COMUNES DE LA INTERFAZ SE PODRÍAN HABER LLAMADO FUERA DEL BUCLE
            Log.d(MainKotlin::class.java.name, ave.sonido())
            Log.d(MainKotlin::class.java.name, ave.obtenerAlturaVuelo())
            if (ave is PolloCamperoKotlin) {
                //MÉTODOS DE LA CLASE
                with(PolloCamperoKotlin) {
                    Log.d(MainKotlin::class.java.name, ave.comerMaiz())
                    Log.d(MainKotlin::class.java.name, ave.ponerHuevos())
                }
            } else if (ave is PichonTitanicoYmecanicoKotlin) {
                //MÉTODOS DE LA CLASE
                with(ave) {
                    Log.d(MainKotlin::class.java.name, ave.disparar())
                }
            }
        }
    }

    fun llenarLista() {
        listadoAvesKotlin.add(PolloCamperoKotlin())
        listadoAvesKotlin.add(PichonTitanicoYmecanicoKotlin())
    }
}