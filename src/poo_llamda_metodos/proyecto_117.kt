package poo_llamda_metodos

class Operaciones {
    var valor1: Int = 0
    var valor2: Int = 0
    fun cargar() {
        print("Ingrese primer valor:")
        valor1 = readln().toInt()
        print("Ingrese segundo valor:")
        valor2 = readln().toInt()
        this.sumar()
        this.restar()
    }
    fun sumar() {
        val suma = this.valor1 + this.valor2
        println("La suma de $valor1 y $valor2 es $suma")
    }
    fun restar() {
        val resta = this.valor1 - this.valor2
        println("La resta de $valor1 y $valor2 es $resta")
    }
}
fun main(parametro: Array<String>) {
    val operaciones1 = Operaciones()
    operaciones1.cargar()
}