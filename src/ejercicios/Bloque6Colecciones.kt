package ejercicios

fun ejecutarBloque6() {
    println("=== BLOQUE 6: COLECCIONES ===")


    val compras = mutableListOf("Leche", "Pan", "Huevos")
    compras.add("Mantequilla")
    compras.removeAt(1)
    println("26. Lista: $compras")


    val precios = listOf(30.0, 55.0, 20.0, 80.0, 45.0)
    val baratos = precios.filter { it < 50 }
    println("27. Precios menores a 50: $baratos")


    val amigos = listOf("Ana", "Pedro", "Andrés", "Luis")
    val conA = amigos.find { it.startsWith("A") }
    println("28. Primer amigo con A: $conA")


    fun Int.esNegativo(): Boolean = this < 0
    println("29. ¿-5 es negativo? ${(-5).esNegativo()}")


    fun String.quitarEspacios(): String = this.replace(" ", "")
    println("30. Sin espacios: ${"Hola mundo kotlin".quitarEspacios()}")
}