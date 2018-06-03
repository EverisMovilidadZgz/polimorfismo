package victordev.es.polimorfismo.clases

class PichonTitanicoYmecanicoKotlin {
    companion object {
        val DISPAROS_POR_DEFECTO: Int = 2
    }

    fun disparar() : String {
        return "Se han disparados ${DISPAROS_POR_DEFECTO} misiles titánicos"

    }
}