fun main() {
    print("cantidad de alturas: ")
    val negros = readln().toInt()
    var suma = 0.0
    var indigenas = 1

    while (indigenas <= negros) {
        print("Ingrese la altura: ")
        val altura: Double = readln().toDouble()
        suma += readln().toInt()
        indigenas++
    }

    println("Altura promedio: ${suma / negros.toDouble()}")

}