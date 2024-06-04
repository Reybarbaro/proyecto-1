import java.time.LocalDate

fun main() {
    //  Verificar si una fecha es Navidad tonoto
    print("Ingrese una fecha (dd/mm/yyy): ")
    val fecha = readLine()!!.split("/")
    val dia = fecha[0].toInt()
    val mes = fecha[1].toInt()
    val año = fecha[2].toInt()

    val fechaNavidad = LocalDate.of(año, 12, 25)
    val fechaIngresada = LocalDate.of(año, mes, dia)

    if (fechaIngresada == fechaNavidad) {
        println("La fecha ingresada es Navidad!")
    } else {
        println("La fecha ingresada no es Navidad.")
    }

    // Calcular el cubo de un número si todos los valores son iguales
    print("Ingrese un valor: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrese otro valor: ")
    val valor2 = readLine()!!.toInt()
    print("Ingrese otro valor: ")
    val valor3 = readLine()!!.toInt()

    if (valor1 == valor2 && valor2 == valor3) {
        val cubo = valor1 * valor1 * valor1
        println("El cubo del número es: $cubo")
    } else {
        println("Los valores no son iguales.")
    }

    //  Verificar si todos los números son menores a 10 papuu
    if (valor1 < 10 && valor2 < 10 && valor3 < 10) {
        println("Todos los números son menores a diez.")
    } else {
        println("No todos los números son menores a diez.")
    }

    // 4. Verificar si al menos uno de los números es menor a 10
    if (valor1 < 10 || valor2 < 10 || valor3 < 10) {
        println("Alguno de los números es menor a diez.")
    } else {
        println("Ninguno de los números es menor a diez.")
    }

    //  Determinar el cuadrante de un punto en el plano
    print("Ingrese la coordenada x: ")
    // el ! funcona para evitar el null
    val x = readLine()!!.toInt()
    print("Ingrese la coordenada y: ")
    val y = readLine()!!.toInt()

    if (x > 0 && y > 0) {
        println("El punto se encuentra en el 1º cuadrante.")
    } else if (x < 0 && y > 0) {
        println("El punto se encuentra en el 2º cuadrante.")
    } else if (x < 0 && y < 0) {
        println("El punto se encuentra en el 3º cuadrante.")
    } else if (x > 0 && y < 0) {
        println("El punto se encuentra en el 4º cuadrante.")
    } else {
        println("El punto se encuentra en el origen.")

    }

    //  Encontrar el menor y el mayor de una lista de tres valores
    val menor = if (valor1 < valor2) if (valor1 < valor3) valor1 else valor3 else if (valor2 < valor3) valor2 else valor3
    val mayor = if (valor1 > valor2) if (valor1 > valor3) valor1 else valor3 else if (valor2 > valor3) valor2 else valor3

    println("El menor valor es: $menor")
    println("El mayor valor es: $mayor")
}