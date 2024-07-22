package conceptos_funciones

fun main() {

    mostrarCuadrado()


    mostrarProducto()
}


fun mostrarCuadrado() {
    print("Ingrese un número entero: ")
    val numero = readln().toInt()
    val cuadrado = numero * numero
    println("El cuadrado de $numero es $cuadrado")
}


fun mostrarProducto() {
    print("Ingrese el primer número: ")
    val numero1 = readln().toInt()
    print("Ingrese el segundo número: ")
    val numero2 = readln().toInt()
    val producto = numero1 * numero2
    println("El producto de $numero1 y $numero2 es $producto")
}