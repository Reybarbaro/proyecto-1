package estructuracondicionalwhen

fun main(){
   print("ingrse primera nota")
    val nota1 = readln().toInt()
    print("ingrese la segunda nota")
    val nota2 = readln().toInt()
    print("ingrese la tercera nota")
    val nota3 = readln().toInt()
    val promedio = (nota1+nota2+nota3) / 3
    when {

        promedio >= 7 -> print("promotional")
        promedio >= 4 && promedio < 7-> print("regular")
        else -> print("reprobado papiiiii")



    }


}

