package ejercicios

fun ejecutarBloque4() {
    println("=== BLOQUE 4: CICLOS ===")


    print("16. ")
    for (i in 1..10) print("$i ")
    println()


    print("17. ")
    for (i in 10 downTo 1) print("$i ")
    println()


    print("18. ")
    for (i in 1..20 step 3) print("$i ")
    println()


    var energia = 5
    while (energia > 0) {
        println("19. Energía restante: $energia")
        energia -= 1
    }


    var contrasena: String
    var intentos = 0
    do {
        contrasena = "1234"
        intentos++
    } while (contrasena != "1234")
    println("20. Contraseña correcta en $intentos intento(s)")
}