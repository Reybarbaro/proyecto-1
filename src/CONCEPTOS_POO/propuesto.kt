package CONCEPTOS_POO


class Alumno {

    var nombre: String = ""
            var nota: Double = 0.0


    fun inicializar(nombre: String, nota: Double) {
         this.nombre = nombre
                this.nota = nota
                   }


     fun imprimir() {
        println("Nombre: $nombre")
              println("Nota: $nota")
    }

    
    fun verificarRegular() {
        if (nota >= 4) {
            println("$nombre está regular.")
        } else {
                     println("$nombre no está regular.")
         }
         }
}
