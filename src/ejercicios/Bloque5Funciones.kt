package ejercicios

fun ejecutarBloque5() {
    println("=== BLOQUE 5: FUNCIONES ===")


    fun saludar(nombre: String): String = "Hola, $nombre!"
    println("21. ${saludar("Sara")}")


    val sumar = { a: Int, b: Int -> a + b }
    println("22. Suma: ${sumar(3, 4)}")


    fun crearRectangulo(ancho: Int, alto: Int = 10): String = "Rectángulo: ${ancho}x${alto}"
    println("23. ${crearRectangulo(5)}")


    println("24. ${crearRectangulo(ancho = 7)}")


    fun convertirDolares(dolares: Double): Double = dolares * 4200.0
    println("25. ${convertirDolares(10.0)} pesos colombianos")
}