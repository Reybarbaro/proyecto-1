package estructuracondicionalwhen

fun main () {

    print("ingrese coordenads x del punto")
    val x = readln().toInt()
    print("ingrese codenadas y del punto")
    val y = readln().toInt()
    when{
       x > 0 && y > 0 -> println("primer cuadrante")
       x < 0 && y > 0 -> println(" segundo cuadrante")
       x < 0 && y < 0 -> println("tercer cuadrante")
       x > 0 && y < 0 -> println("cuarto cuadrante")
       else -> println(" el punto se encuentra en un ")
    }



}

