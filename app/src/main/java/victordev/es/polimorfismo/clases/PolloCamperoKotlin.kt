package victordev.es.polimorfismo.clases

class PolloCamperoKotlin {
    companion object {
        val MENSAJE_PONER_HUEVOS: String = "El pollo campero se ha puesto a poner huevos cómo loco"
        //Al ser un lenguaje inferido no es obligatorio especificar el tipo de dato
        val MENSAJE_COMER_MAIZ = "El pollo campero se ha puesto a comer maíz cómo si no existiera un mañana";
    }

    fun ponerHuevos(): String {
        return MENSAJE_PONER_HUEVOS
    }

    fun comerMaiz(): String {
        return MENSAJE_COMER_MAIZ
    }
}