package funciones_cin_retorno


fun retornarSuperficie(lado1: Int,lado2: Int): Int {
    return lado1 * lado2
}
fun main() {
            println("Primer rectangulo")
       print("escriba lado menor del rectangulo:")
    val lado1 = readln().toInt()
      print("escriba lado mayor del rectangulo:")
    val lado2 = readln().toInt()
    println("Segundo rectangulo")
          print("escriba lado menor del rectangulo:")
      val lado3 = readln().toInt()
    print("escriba lado mayor del rectangulo:")
        val lado4 = readln().toInt()
    if (retornarSuperficie(lado1,lado2) == retornarSuperficie(lado3,lado4))
        print("los dos rectangulos tiene la misma superficie")
    else
             if (retornarSuperficie(lado1,lado2) > retornarSuperficie(lado3,lado4))
            print("el primer rectangulo tiene una superficie mayor")
                else
                print("el segundo rectangulo tiene una superficie mayor")
}




