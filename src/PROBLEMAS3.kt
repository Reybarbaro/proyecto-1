fun main() {

   /*
    println("Ingrese el primer valor entero:")
    val valor1 = readln().toInt()

    println("Ingrese el segundo valor entero:")
    val valor2 = readln().toInt()


    val mayor = if (valor1 > valor2) valor1 else valor2


    println("El mayor valor es: $mayor")
    */
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
}