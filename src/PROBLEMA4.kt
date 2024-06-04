fun main(parametro: Array<String>) {
    print("Ingrese un valor entero: ")
    val valor = readln().toInt()

    val resultado = if (valor % 2 == 0) {
        println("Se calcula el cuadrado del valor.")
        valor * valor
    } else {
        println("Se calcula el cubo del valor.")
        valor * valor * valor
    }

    println("El resultado es: $resultado")
}