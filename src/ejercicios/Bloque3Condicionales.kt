package ejercicios

fun ejecutarBloque3() {
    println("=== BLOQUE 3: CONDICIONALES ===")


    val edad = 20
    if (edad >= 18) println("11. Puede votar")
    else println("11. No puede votar")


    val nota = 75
    val resultado = if (nota >= 60) "Aprobado" else "Reprobado"
    println("12. Resultado: $resultado")


    val color = "Rojo"
    when (color) {
        "Rojo" -> println("13. Pare")
        "Amarillo" -> println("13. Precaución")
        "Verde" -> println("13. Siga")
    }


    val temperatura = 20
    when {
        temperatura < 15 -> println("14. Frío")
        temperatura in 15..25 -> println("14. Templado")
        temperatura > 25 -> println("14. Calor")
    }


    val variable: Any = "Hola"
    when (variable) {
        is String -> println("15. Es un String")
        is Int -> println("15. Es un Int")
    }
}