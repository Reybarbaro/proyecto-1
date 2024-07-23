package funciones_parametros_funcion_por_defecto

fun sumar(v1: Int, v2: Int, v3: Int = 0) = v1 + v2 +v3

fun main() {
    println("La suma de 2 + 3 es ${sumar(2,3)}")
    println("La suma de 1 + 2 + 3 es ${sumar(1,2,3)}")
    print("La suma de 1 + 2 + 3  es ${sumar(1,2,3)}")
}