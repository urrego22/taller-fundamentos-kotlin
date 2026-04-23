package ejercicios

fun ejecutarBloque1() {
    println("=== BLOQUE 1: VARIABLES ===")


    val nombre = "Sara"
    var ciudad = "Bogotá"
    ciudad = "Medellín"
    println("1. Nombre: $nombre, Ciudad: $ciudad")


    val anioNacimiento = 2007
    val edad = 2025 - anioNacimiento
    println("2. Edad aproximada: $edad años")


    val precioCoche: Double = 15000.99
    val pesoNaranja: Float = 0.3f
    val poblacionMundo: Long = 8000000000L
    println("3. Coche: $precioCoche, Naranja: $pesoNaranja, Población: $poblacionMundo")


    val estaLloviendo = false
    println("4. ¿Está lloviendo? $estaLloviendo")


    println("5. Velocidad de la luz: ${Constants.VELOCIDAD_LUZ}")
}

object Constants {
    const val VELOCIDAD_LUZ = 299792458
}
