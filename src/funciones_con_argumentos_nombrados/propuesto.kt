package funciones_con_argumentos_nombrados



fun cargas ( valor: Int, terminos: Int = 0){
    for(i in 1..terminos){
   println("$valor * $i  ${valor * i}")

   }
}



fun main (){
    cargas(valor = 5, terminos =15)





}