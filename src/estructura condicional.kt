fun main() {
    /*
        print("ingrese el sueldo del empleado")
        val Sueldo: Double = readln().toDouble()
        if (Sueldo > 3000){
            println("debe pagar el impuesto")
        }
        if (Sueldo < 3000){
            println("no debe pagar impuesto")

        }
    */

    /*
        //problema2
        print("ingrese el primer valor")
        val valor1 = readln().toDouble()
        val valor2 = readln().toDouble()
        if (valor1 > valor2) {
            print("el mayor valor es $valor1")
        } else {
            print("el mayor valor es $valor2")

        }
        */

    print("inrese el primer valor:")
    val valor1: Int = readln().toInt()
    print("ingrese el segundo valor")
    val valor2: Int = readln().toInt()
    if (valor1 < valor2) {
        val suma: Int = valor1 + valor2
        val resta: Int = valor1 - valor2
        println("la suma de dos valores es $suma")
        println("la resta de los dos valores es $resta")

    } else {
        val producto: Int = valor1 * valor2
        val division: Int = valor1 / valor2
        println("la multiplicaion de los valores es $producto")
        println("la division de los valores es $division")
    }
}