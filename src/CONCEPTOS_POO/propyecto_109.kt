package CONCEPTOS_POO

class Persona{

    var nombre: String = ""
            var edad: Int = 0

    fun inicializar(nombre:String, edad: Int){
        this.nombre = nombre
        this.edad = edad




    }


    fun immprimiendo(){
      println("nombre: $nombre y tiene una edad de $edad")



    }
fun esmayordeedad(){

    if(edad >=18)
    println("es mayor de edad $nombre")
    else
println("no es mayor de edad $nombre")
}

fun main(){
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("pedro", 16)
    persona1.immprimiendo()
    persona1.esmayordeedad()


    val persona2:Persona
    persona2=Persona()
   persona2.inicializar("Ana", 16)
   persona2.immprimiendo()
    persona2.esmayordeedad()



}
}