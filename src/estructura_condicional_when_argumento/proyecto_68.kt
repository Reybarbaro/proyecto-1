package estructura_condicional_when_argumento

fun main() {

    var cant1 = 0
    var cant2 = 0
    for (i in 1..10) {
        print("ingrese un valor entero")
        val valor = readln().toInt()
        when (valor) {

            0 -> cant1++
            1, 5, 10 -> cant2++


        }

    }
    println("cantidad de numeros 0 ingresados: $cant1")
    println("cantidad de numeros 1,2 o 3 ingresados: $cant2")

}