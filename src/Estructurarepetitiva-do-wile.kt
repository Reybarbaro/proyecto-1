fun main() {
    //problema1

      /*
    do {
        print("Ingrese un valor comprendido entre 0 y 999:")
        val valor = readln().toInt()
        if (valor < 10)
            println("El valor ingresado tiene un dígito")
        else
            if (valor < 100)
                println("El valor ingresado tiene dos dígitos")
            else
                println("El valor ingresado tiene tres dígitos")
    } while (valor != 0)

       */
    //problema2
      /*
          var cant = 0
          var suma = 0
          do {
              print("Ingrese un valor (0 para finalizar):")
              val valor = readln().toInt()
              if (valor != 0) {
                  suma += valor
                  cant++
              }
          } while (valor !=0)
          if (cant != 0) {
              val promedio = suma / cant
              print("El promedio de los valores ingresados es: $promedio")
          } else
              print("No se ingresaron valores.")

       */

    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("Ingrese el peso de la pieza (0 pera finalizar):")
        val peso = readln().toDouble()
        if (peso > 10.2)
            cant1++
        else
            if (peso >= 9.8)
                cant2++
            else
                if (peso > 0)
                    cant3++
    } while(peso != 0.0)
    println("Piezas aptas: $cant2")
    println("Piezas con un peso superior a 10.2: $cant1")
    println("Piezas con un peso inferior a 9.8: $cant3");
    val suma = cant1 + cant2 + cant3
    println("Cantidad total de piezas procesadas: $suma")
      }

