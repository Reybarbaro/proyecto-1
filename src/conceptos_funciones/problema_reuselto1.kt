package conceptos_funciones

fun main() {

    mostrarMenor()


    mostrarMenor()
}

fun mostrarMenor() {
    print("Ingrese el primer número: ")
    val numero1 = readln().toInt()
    print("Ingrese el segundo número: ")
    val numero2 = readln().toInt()
    print("Ingrese el tercer número: ")
    val numero3 = readln().toInt()

    val menor = when {
        numero1 <= numero2 && numero1 <= numero3 -> numero1
        numero2 <= numero1 && numero2 <= numero3 -> numero2
        else -> numero3
    }

    println("El menor de los tres números es: $menor")
}