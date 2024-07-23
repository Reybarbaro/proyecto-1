package funciones_con_argumentos_nombrados

fun caclcularsueldo(
  nombre: String, costoHora: Double,
  cantidadHoras: Int


) {
    val sueldo = costoHora * cantidadHoras
    println("$nombre traajo $cantidadHoras horas, " + "se le paga por hora $costoHora por lo tanto  le corresponde un sueldo de $sueldo")




}