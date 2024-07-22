package funciones_cin_retorno
fun retornarSuperfivie(lado:Int):Int{

  val sup = lado*lado
  return sup


}
fun main(){

    print("ingrese el valor del lado del cuadrado:")
    val la = readln().toInt()
    val superficie = retornarSuperfivie(la)
    println("la superficie del cuadrado es $superficie")





}