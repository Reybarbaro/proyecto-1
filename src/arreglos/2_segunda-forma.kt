package arreglos

import kotlin.random.Random

fun main(){
    val arreglo1: IntArray
      arreglo1 = IntArray(4)
    val arrgelo2 = IntArray(4)
    val arreglosuma = IntArray(4)

    var verArreglo1 = "arreglo1: "
    var verArreglo2 = "Arreglo2"
    var verarreglosuma = "arreglo sumado"
    for (i in 0 .. arreglo1.size -1){
        arreglo1[i]= Random.nextInt(0,10)
        arrgelo2[i] =Random.nextInt(0,10)
        arreglosuma[i] = arreglo1[i] + arrgelo2[i]


        verArreglo1 += if (i == arreglo1.lastIndex)
verArreglo1[i] else verArreglo1[i].toString() + ","

        verArreglo2 += if (i == arrgelo2.lastIndex)
            arrgelo2[i] else verArreglo2[i].toString() +","
verarreglosuma += if (i == arreglosuma.lastIndex)
    arreglosuma[i] else arreglosuma[i].toString()


    }

println(verArreglo1)
    println(verArreglo2)
    println(verarreglosuma)




}


