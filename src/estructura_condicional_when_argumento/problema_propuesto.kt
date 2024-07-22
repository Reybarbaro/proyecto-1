package estructura_condicional_when_argumento
fun main(){
    var contador0 = 0
    var contador1 = 0
    var contador2 = 0
    var contadormas = 0

    for (i in 1..10){

        print("ingrese la cantidad de hijos de la familia $i")
        val hijos = readln().toInt()
        when(hijos){

            0 -> contador0++
            1 -> contador1++
            2 -> contador2++
            else -> contadormas++

        }
    }

    println("cantidada de familias con o hijos $contador0")
    println("cantidada de familias con 1 hijo $contador1")
    println("cantidada de familias con 2 hijo $contador2")
    println("cantidada de familias con mas de 2 hijos $contadormas")



}
