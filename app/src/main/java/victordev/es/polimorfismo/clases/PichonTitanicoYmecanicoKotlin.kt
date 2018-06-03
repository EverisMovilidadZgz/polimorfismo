package victordev.es.polimorfismo.clases

import victordev.es.polimorfismo.interfaces.AveKotlinInterface

class PichonTitanicoYmecanicoKotlin : AveKotlinInterface {
    companion object {
        val DISPAROS_POR_DEFECTO: Int = 2
        val MENSAJE_ALTURA_VUELO = "20000m"
        val MENSAJE_SONIDO = "IIINGGGG!! GRIINNGG!!"
    }

    fun disparar(): String {
        return "Se han disparados ${DISPAROS_POR_DEFECTO} misiles titánicos"
    }

    override fun obtenerAlturaVuelo(): String {
        return MENSAJE_ALTURA_VUELO
    }

    override fun sonido(): String {
        return MENSAJE_SONIDO
    }
}