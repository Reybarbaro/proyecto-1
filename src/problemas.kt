fun main() {
    /*
    print("ingrese la primera nota")
val nota1 = readln().toDouble()

    print("ingrese la segunda nota")
    val nota2 = readln().toDouble()

    val promedio= (nota1+nota2 )/ 2

    if (promedio >=70) { println("promocionado")
    } else { println(" quedado papu")
    }
    */
/*
    println("ingrese el numero entero entre 1 y 99:")
    val numero = readln().toInt()

    if (numero in 1..9) {

        if (numero <= 10) {
            println("el numero tiene un digito")
        } else {
            println("el numero tiene dos digitos")
//ES UNA BELLAKITA LOS PANTIES SE LOS QUITA ELLA SOLITA


        }

    }

  */
    fun main() {

        println("Ingrese el primer valor entero:")
        val valor1 = readln().toInt()

        println("Ingrese el segundo valor entero:")
        val valor2 = readln().toInt()


        val mayor = if (valor1 > valor2) valor1 else valor2


        println("El mayor valor es: $mayor")
    }





}