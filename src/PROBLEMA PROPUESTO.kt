fun main() {

    print("Ingrese un valor entero entre 1 y 99: ")
    val valor = readln().toInt()

    if (valor in 1..99) {

        val cantidadDeDigitos = if (valor < 10) {
            1
        } else {
            2
        }


        println("El número $valor tiene $cantidadDeDigitos dígito")
    } else {
        println("El valor ingresado no está en el PAPU RANGO INDICADO PAPU PONTE SERIO PAPUUUUUUU ")
    }
}