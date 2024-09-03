package funciones_de_tipo_arreglo
fun main(){






var matriz = arrayOf(
    intArrayOf(1,2,3),
    intArrayOf(4,5,6),
    intArrayOf(7,8,9),
    intArrayOf(10,11,12,13,14),
    )
println("matriz[0][0]")
println("matriz[0][2n]")



}


fun recorreMatriz1(matriz: Array<IntArray>){

 for (fila in (0  until matriz.size))  {
     println()
     for (columna in (0 until matriz[fila].size))
         println("posicon[$fila][$columna] : " +
         "${matriz[fila][columna]}" )





 }

    fun recorreMatriz1(matriz: Array<IntArray>){
        for (i in matriz.indices){
            println()
            for (j in matriz[i].indices)
                println("posicion[$i][$j] : ${matriz[i][j]}")




        }





    }

    /*
    Ejercicio 1: Suma de dos matrices
    Escribe un programa en Kotlin que tome dos matrices de
    enteros de las mismas dimensiones y calcule su suma.
    El programa debe mostrar la matriz resultante.
    Instrucciones:
    1. Define en el main dos matrices de enteros
    (por ejemplo, de tamaño 3x3).
    2. Metodo que sume las matrices elemento por
    elemento y reciba por parametro las filas,
    las columnas, y ambas matrices.
    3. Metodo que recibe e imprime la matriz resultante.
    */


}


fun sumarMatrriz(
    filas: Int, columnas: Int, matrix1: Array<IntArray>,
    matrix2: Array<IntArray>
): Array<IntArray> {
  val result = Array(filas) {IntArray(columnas)}

    for (f in 0 until filas)
        for (c in 0 until columnas)
            result[f][c] = matrix1[f]{c} + matrix2[f][c]


}



