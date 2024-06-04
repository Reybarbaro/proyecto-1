fun main() {

   /* var x = 1
        while (x < 100){
            println(x)
            x ++
        }


    print("ingrese un valor")
    val valor1 = readln().toInt()
    var c =1
    while (c <= valor1){
        println(x)
        x++
    }


    var s = 1

    var suma = 0
    while (s <= 10){
print("ingrese el valor$s:")
        val valor = readln().toInt()
        suma = + valor
        s++

        }
    println("la suma de los valores ingresados es $ suma")
    val promedio = suma / 10
    println("el promedio es $promedio")

    */



    print("Cuantas piezas procesará:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("Ingrese la medida de la pieza:")
        val largo = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30){
            cantidad = cantidad +1

    }
    x++
         }
    print("La cantidad de piezas aptas son: $cantidad")


}