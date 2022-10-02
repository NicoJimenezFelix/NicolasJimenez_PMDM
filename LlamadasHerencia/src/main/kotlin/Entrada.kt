object Entrada {
    @JvmStatic
    fun main(args: Array<String>) {
        val llamadaNacional: Llamada = LlamadaNacional(1234, 5678, 10, 1)
        llamadaNacional.mostrarDatos()
    }
}