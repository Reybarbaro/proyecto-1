package funciones_internas


fun multiplos2y5() {
    fun multiplo(numero: Int, valor: Int) = numero % valor == 0
    var mult2 = 0
    var mult5 = 0
    for(i in 1..10) {
        print("Ingrese valor:")
        val valor = readln().toInt()
        if (multiplo(valor, 2))
            mult2++
        if (multiplo(valor, 5))
            mult5++
    }
    }