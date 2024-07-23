package tarea_2

fun retornarPerimetro (lado: Int) = lado * 4

fun main() {
    print("Ingrese el lado del cuadrado:")
    val la = readln().toInt()
    val perimetro = retornarPerimetro(la)
    println("El perimetro del cuadrado es $perimetro")
}

