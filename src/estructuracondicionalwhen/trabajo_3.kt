package estructuracondicionalwhen

fun main() {
    println("Ingrese la cantidad de triángulos:")
    val n = readln().toInt()

    var equilateros = 0
    var isosceles = 0
    var escalenos = 0

    for (i in 1..n) {
        println("Ingrese los tres lados del triángulo:")
        val a = readln().toInt()
        val b = readln().toInt()
        val c = readln().toInt()

        when {
            a == b && b == c -> {
                println("El triángulo es: Equilátero")
                equilateros++
            }
            a == b || a == c || b == c -> {
                println("El triángulo es: Isósceles")
                isosceles++
            }
            else -> {
                println("El triángulo es: Escaleno")
                escalenos++
            }
        }
    }

    println("Cantidad de triángulos equiláteros: $equilateros")
    println("Cantidad de triángulos isósceles: $isosceles")
    println("Cantidad de triángulos escalenos: $escalenos")
}