import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.floor

fun main() {
    println("Hola mundo")
    val pi = 3.1416
    val nombre = "Ada Lovelace" // const
    var contador = 0
    contador += 1
    println("$pi - $nombre - $contador")

    // Primitivos
    var bites: Byte = 127
    var shorts: Short = 32767
    var ints: Int = 10
    var longs: Long = 500
    var charts: Char = 'A'
    var booleans: Boolean = false

    println("$bites - $shorts - $ints - $longs - $charts - $booleans")

    var floats: Float = 4.36f
    var doubles: Double = 4.36

    val sumdecimal: Float = doubles.toFloat() + floats

    println("$doubles - $floats - $sumdecimal")

    print("Ingresa el Radio del Círculo:  ")
    val radio = readLine()?.toDoubleOrNull()
    if (radio != null) {
        val area = PI * pow(radio, 2.0)
        val foors = floor(area)
        println("El area del círculo es: $foors")
    } else {
        println("Entrada que esta totalmente invalida")
    }

    val a = 4 + 5
    val b = 6 - 4
    val c = 7 * 4
    val d = 8 / 2
    val e = 9 % 3 // 6 - 3 - 3 - 0 Modulo
    val f = 10 % 3 // 7 - 4 - 3 - 1 Modulo

    println("$a - $b - $c - $d - $e - $f")


    print("Ingresa un numero entero:  ")

    val parimpar = readLine()?.toIntOrNull()

    if (parimpar != null) {
        if ( parimpar % 2 == 0 ) {
            println("Es par")
        } else {
            println("Es inpar")
        }
    }  else {
        println("Entrada que esta totalmente invalida")
    }

    // No Primitivos

    val strings: String = "Hola mundo soy nuevo aqui"
    val lists: List<Any> = listOf("Hola", 3, true)
    val lists2: List<String> = listOf("Hola", "Mundo", "Estoy en kotlin")

    println("$strings - ${lists.toString()} ${lists2.toString()}")

    val ubites: UByte = 127u
    val ushorts: UShort = 32767u
    val uints: UInt = 10u
    val ulongs: ULong = 500u

    var sumu = ints.toUInt() + uints

    println("$ubites - $ushorts - $uints - $ulongs - $sumu")
}


