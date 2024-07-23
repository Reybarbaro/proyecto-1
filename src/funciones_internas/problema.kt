package funciones_internas

fun main() {
    encontrarMayor(5, 10)
    encontrarMayor(15, 3)
    encontrarMayor(7, 7)
    encontrarMayor(-2, -8)
    encontrarMayor(100, 50)
}

fun encontrarMayor(num1: Int, num2: Int) {
    fun calcularMayor(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    val mayor = calcularMayor(num1, num2)
    println("El mayor entre $num1 y $num2 es: $mayor")
}
