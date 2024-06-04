fun main() {
// readln convierte los datos de entrada del teclado
    // toInt cinvierte los datos de enrada en numericos
    println("ingrese primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese segundo valor")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("la suma de $valor1 + $valor2 es igual a $suma")
    val producto = valor1 + valor2
    println("el producto de $valor1 * $valor2 es $producto")

    println("ingrese el valor del ldao del cudrado")

    val lado = readln().toInt()
    val perimetro = 4 * lado

    println("el perimetro del cuadrado es igual a $perimetro")

    print(" ingrese el precio del articulo")
    val precio = readln().toDouble()
    println("ingrese la cantidad que lleva el cliente")
    val cantidad = readln().toInt()

    val total = precio * cantidad

    println("el total a pagar es $ $total ")




}