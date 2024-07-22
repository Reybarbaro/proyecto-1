package funciones_cin_retorno

fun retornar(lado: Int): Int {
    val perimetro = lado * 4
    return perimetro
}

fun main(parametro: Array<String>) {
    print("Ingrese el lado del cuadrado mi bro:")
    val lado = readln().toInt()
      print("El perimetro es: ${retornar(lado)} turna fun wa tututuutut ")
}