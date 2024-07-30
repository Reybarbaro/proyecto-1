package arreglos

fun main() {
    val arr = IntArray(8)


       for (i in arr.indices) {
        print("Ingrese el elemento ${i + 1}: ")
          arr[i] = readLine()!!.toInt()
    }

    var acumuladoTotal = 0
       var acumuladoMayor36 = 0
    var cantidadMayor50 = 0


    for (elemento in arr) {
          acumuladoTotal += elemento
        if (elemento > 36) {
               acumuladoMayor36 += elemento
        }
         if (elemento > 50) {
            cantidadMayor50++
        }
    }

     println("El valor acumulado de todos los elementos es: $acumuladoTotal")
      println("El valor acumulado de los elementos mayores a 36 es: $acumuladoMayor36")
       println("La cantidad de valores mayores a 50 es: $cantidadMayor50")
}