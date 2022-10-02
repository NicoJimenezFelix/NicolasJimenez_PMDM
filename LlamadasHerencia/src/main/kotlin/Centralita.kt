package Centralita

import Llamada
import LlamadaLocal
import LlamadaProvincial

class Centralita {
    private val listaLlamadas: ArrayList<Llamada?>
    var costeTotal = 0.0

    init {
        listaLlamadas = ArrayList<Any?>()
    }

    fun agregarLlamada(llamada: Llamada) {
        listaLlamadas.add(llamada)
        llamada.mostrarDatos()
    }

    fun mostrarLlamadas(tipo: String?) {
        for (item in listaLlamadas) {
            /*if (tipo.equalsIgnoreCase("Provincial")){
                if (item instanceof LlamadaProvincial){
                    item.mostrarDatos();
                }
            }*/
        }
    }

    fun listarNacionales() {
        for (item in listaLlamadas) {
            if (item is LlamadaLocal) {
                item.mostrarDatos()
            }
        }
    }

    fun listarProvinciales() {
        for (item in listaLlamadas) {
            if (item is LlamadaProvincial) {
                item.mostrarDatos()
            }
        }
    }

    fun listarLocales() {
        for (item in listaLlamadas) {
            if (item is LlamadaLocal) {
                item.mostrarDatos()
            }
        }
    }

    fun mostrarCostes() {
        for (item in listaLlamadas) {
            costeTotal += item.getCoste()
        }
        println("Coste total: $costeTotal")
    }
}