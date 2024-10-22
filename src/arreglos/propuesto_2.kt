package arreglos

import kotlin.random.Random

//opcion 1 del codigo0
fun main() {
val arr1 = IntArray(4)
val arr2 = IntArray(4)
val arrsuma = IntArray(4)

    println("ingrese los elementos del primer arrgelo:")
    for (i in arr1.indices){
print("elemento: ${i +1}:")
        arr1[i] = readln().toInt()
        }
println("ingrese los elementos del segundo arreglo")
    for (i in arr2.indices) {
        print("elemento: ${i + 1}:")
        arr2[i] = readln().toInt()

        }

        for (i in arrsuma.indices) {
            arrsuma[i] = arr1[i] + arr2[i]

        }
        println("el areglo resultante de la suma es:")
        for (i in arrsuma.indices) {
            println("elemeto ${i + 1}: ${arrsuma[i]}")
        }


    }







