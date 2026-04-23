package ejercicios

fun ejecutarBloque2() {
    println("=== BLOQUE 2: NULL SAFETY ===")


    var apodo: String? = null
    println("6. Apodo: $apodo")


    val nombreMostrar = apodo ?: "Sin apodo"
    println("7. $nombreMostrar")


    var correo: String? = "urregosara984@gmail.com"
    println("8. Longitud del correo: ${correo?.length}")


    correo?.let {
        println("9. Correo enviado a $it")
    }


    var numero: Int? = 42
    println("10. Longitud: ${numero!!}")
}
