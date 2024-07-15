package estructuracondicionalwhen

fun main (){
   print("ingrese un numero")
    val num1 = readln().toInt()

    when{

      num1 < 0 -> println("numero entero")
      num1 > 0 -> println("numero negativo")
        else -> println("numero nulo")

    }




    }






