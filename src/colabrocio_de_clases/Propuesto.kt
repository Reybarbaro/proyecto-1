package colabrocio_de_clases


class Socio(val nombre: String, val antiguedad: Int)


class Club(val socio1: Socio, val socio2: Socio, val socio3: Socio) {

    fun imprimirSocioConMayorAntiguedad() {
        val socioConMayorAntiguedad = listOf(socio1, socio2, socio3).maxByOrNull { it.antiguedad }
        if (socioConMayorAntiguedad != null) {
            println("El socio con mayor antigüedad es: ${socioConMayorAntiguedad.nombre}")
        } else {
            println("No hay socios en el club.")
        }
    }
}

fun main() {

    val socio1 = Socio("Juan", 5)
    val socio2 = Socio("Ana", 10)
    val socio3 = Socio("Luis", 7)


    val club = Club(socio1, socio2, socio3)


    club.imprimirSocioConMayorAntiguedad()
}