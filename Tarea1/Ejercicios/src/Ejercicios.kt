class Ejercicios {
}
fun main() {
    var opcionValida = false

    while(!opcionValida) {
        println("Elige una opción:")
        println("Ejercicio 1: Sumar dos números")
        println("Ejercicio 2: Calcular el área de un círculo")
        println("Ejercicio 3: Convertir Celsius a Fahrenheit")
        println("Ejercicio 4: Determinar si el numero es par o impar")
        println("Ejercicio 5: Determinar cual de dos numeros enteros es mayor")
        println("Ejercicio 6: Calcular el Factorial de un numero")
        println("Ejercicio 7: Calculadora de 2 numeros enteros")
        println("Ejercicio 8: Calculadora si un numero es primo")
        println("Ejercicio 9: Ingresar datos del usuario controlado los Null")
        print("Ingresa tu opción: ")

    val opcion = readLine()?.toIntOrNull()

        if (opcion != null && opcion in 1..9) {
            opcionValida = true
            when (opcion) {
                1 -> {
                    print("Ingresa el primer número: ")
                    val numero1 = readLine()?.toIntOrNull() ?: 0
                    print("Ingresa el segundo número: ")
                    val numero2 = readLine()?.toIntOrNull() ?: 0
                    val suma = numero1 + numero2
                    println("La suma de $numero1 y $numero2 es: $suma")
                }
                2 -> {
                    print("Ingresa el radio del círculo: ")
                    val radio = readLine()?.toDoubleOrNull() ?: 0.0
                    val area = Math.PI * radio * radio
                    println("El área del círculo con radio $radio es: $area")
                }
                3 -> {
                    print("Ingresa los grados Celsius a convertir a Fahrenheit: ")
                    var celsius = readLine()?.toDoubleOrNull() ?: 0.0
                    var fahrenheit = celsius * 9/5 + 32
                    println("$celsius Grados Celsius son: $fahrenheit fahrenheit")
                }
                4 -> {
                    print("Ingresa el numero: ")
                    var numero = readLine()?.toIntOrNull() ?: 0
                    if (numero % 2 == 0){
                        println("El numero $numero es par")
                    } else {
                        println("El numero $numero es impar")
                    }
                }
                5 -> {
                    print("Ingresa el primer número entero: *si ingresas un numero no valido se tomara como un 0*: " )
                    val numero1 = readLine()?.toIntOrNull() ?: 0
                    print("Ingresa el segundo número entero: ")
                    val numero2 = readLine()?.toIntOrNull() ?: 0
                    if (numero1 > numero2) {
                        println("El numero $numero1 es mayor al numero $numero2")
                    } else if (numero2 > numero1) {
                        println("El numero $numero2 es mayor al numero $numero1")
                    } else {
                        println("Ambos numeros son iguales")
                    }
                }
                6 -> {
                    print("Ingresa un número entero para calcular su factorial: ")
                    val numero = readLine()?.toIntOrNull()
                    if (numero != null && numero >= 0) {
                        val factorial = calcularFactorial(numero)
                        println("El factorial de $numero es: $factorial")
                    } else {
                        println("Error: Ingresa un número entero válido mayor o igual a 0.")
                    }
                }
                7 -> {
                    println("Que operacion deseas realizar?: ")
                    println("Opcion 1: Sumar ")
                    println("Opcion 2: Restar ")
                    println("Opcion 3: Multiplicar ")
                    println("Operacion 4: Dividir")
                    val operacion = readLine()?.toIntOrNull()
                    when (operacion) {
                        1 -> {
                            println("Ingresa el primer numero")
                            val numero1 = readLine()?.toIntOrNull()?: 0
                            println("Ingresa el segundo numero")
                            val numero2 = readLine()?.toIntOrNull()?: 0
                            val suma = numero1 + numero2
                            println("La suma de $numero1 + $numero2 es igual a: $suma")
                        }
                        2 -> {
                            println("Ingresa el primer numero")
                            val numero1 = readLine()?.toIntOrNull()?: 0
                            println("Ingresa el segundo numero")
                            val numero2 = readLine()?.toIntOrNull()?: 0
                            val resta = numero1 - numero2
                            println("La resta de $numero1 - $numero2 es igual a: $resta")
                        }
                        3 -> {
                            println("Ingresa el primer numero")
                            val numero1 = readLine()?.toIntOrNull()?: 0
                            println("Ingresa el segundo numero")
                            val numero2 = readLine()?.toIntOrNull()?: 0
                            val multiplicacion = numero1 * numero2
                            println("La multiplicacion de $numero1 - $numero2 es igual a: $multiplicacion")
                        }
                        4 -> {
                            println("Ingresa el primer numero")
                            val numero1 = readLine()?.toDoubleOrNull() ?:0.0
                            println("Ingresa el segundo numero")
                            val numero2 = readLine()?.toDoubleOrNull()?: 0.0
                            if (numero2 !=0.0) {
                                val division = numero1 / numero2
                                println("La multiplicacion de $numero1 - $numero2 es igual a: $division")
                            } else {
                                println("Error: No se puede dividir entre cero.")
                            }
                        }
                        else -> {
                            println("Error: Opción no válida.")
                        }
                    }
                }
                8 -> {
                    println("Determinar si un numero ingresado es primo ")
                    print("Ingresa un número entero: ")
                    val numero = readLine()?.toIntOrNull()
                    if (numero != null && numero > 1) {
                        if (esPrimo(numero)) {
                            println("$numero es un número primo.")
                        } else {
                            println("$numero no es un número primo.")
                        }
                    } else {
                        println("Error: Ingresa un número entero válido mayor que 1.")
                    }
                }
                9 -> {
                    println("ingresa tu nombre: ")
                    var nombre = readLine()
                    var apellido: String?
                    do{
                        println("ingresa tu apellido: ")
                       apellido = readLine()
                        if (apellido.isNullOrEmpty()) {
                            println("Error: El apellido no puede ser nulo o vacío.")
                        }
                    } while (apellido.isNullOrEmpty())
                    println("Ingresa tu edad: ")
                    var edad = readLine()?.toIntOrNull()?: 18

                    println("El nombre ingresado es: $nombre, el apellido $apellido y la edad: $edad")


                }

            }
        } else {
            println("Error: Opción no válida. Por favor, ingresa un número del 1 al 9.")
        }
    }
}
fun calcularFactorial(n: Int): Long {
    return if (n == 0 || n == 1) {
        1
    } else {
        n * calcularFactorial(n - 1)
    }
}
fun esPrimo(n: Int): Boolean {
    for (i in 2 until n) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}