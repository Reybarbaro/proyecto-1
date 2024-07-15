package estructuracondicionalwhen

fun main() {
    var total = 0

    for (i in 1..5) {
        println("Ingrese tres valores enteros:")
        val a = readln().toInt()
        val b = readln().toInt()
        val c = readln().toInt()

        val max = when {
            a >= b && a >= c -> a
            b >= a && b >= c -> b
            else -> c
        }

        total += max
    }

    println("El total acumulado de los mayores valores es: " + total)
}