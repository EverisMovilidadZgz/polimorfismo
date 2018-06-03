package victordev.es.polimorfismo.clases

import victordev.es.polimorfismo.interfaces.AveKotlinInterface

class PolloCamperoKotlin : AveKotlinInterface{
    companion object {
        val MENSAJE_PONER_HUEVOS: String = "El pollo campero se ha puesto a poner huevos cómo loco"
        //Al ser un lenguaje inferido no es obligatorio especificar el tipo de dato
        val MENSAJE_COMER_MAIZ = "El pollo campero se ha puesto a comer maíz cómo si no existiera un mañana"

        val MENSAJE_ALTURA_VUELO = "5m"

        val MENSAJE_SONIDO = "PIO!! PIO!!"

    }

    fun ponerHuevos(): String {
        return MENSAJE_PONER_HUEVOS
    }

    fun comerMaiz(): String {
        return MENSAJE_COMER_MAIZ
    }

    override fun obtenerAlturaVuelo(): String {
        return MENSAJE_ALTURA_VUELO

    }

    override fun sonido(): String {
        return MENSAJE_SONIDO
    }
}