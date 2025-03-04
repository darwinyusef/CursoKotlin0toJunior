import kotlin.math.*
import kotlin.random.Random


fun main() {
    val n1 = abs(-10) // | -10 | + 10
    println(n1 + 10)

    val anguloGrados = 30.0
    val anguloRadianes = anguloGrados * PI / 180.0
    val seno = String.format("%.2f", sin(anguloRadianes))
    val coseno = String.format("%.2f", cos(anguloRadianes))
    val newFormatAnguloRaianes = String.format("%.2f", anguloRadianes)
    print("Angulo en radianes: $newFormatAnguloRaianes, su seno $seno y su coseno $coseno ")
    println()

    val n2 = 25.0
    val raizCuadrada = sqrt(n2)
    println("Raiz Cuadrada $raizCuadrada")

    val onlyList: List<Double> = listOf(1.0, 2.0, 2.3, 4.3)
    val media = onlyList.average()
    val counter = onlyList.count()
    val sumas = onlyList.sum()

    println("De la lista ${onlyList.toString()} obtenemos el promedio $media el count $counter y la suma $sumas")

    val aleatorio = Random.nextInt(5, 10)
    val aleatorioDouble = Random.nextDouble(0.0, 1.0)
    val mequiere = Random.nextBoolean()
    println("$aleatorio - ${String.format("%.2f", aleatorioDouble)} - $mequiere")

    /*
    * Lógica computacional
    * comparativos | operadores
    *
    * Comparativos q == p || q >= p
    * eq lt gt lte gte ne
    * == <  >  <=  >= !=
    *
    * || – disjunction (logical OR)
    * && – conjunction (logical AND)
    * ! – negation (logical NOT)
    * NULL
    * */

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue or myFalse)
    println(myTrue && myFalse)
    println(myTrue and myFalse)
    println(!myTrue)

    println(boolNull)


    /*
    * Validar si la persona es mayor a 18 o si es mejor
    * si y entonces
    * if (base lógica) {} else if (base lógica) {} else {}
    * */

    val edad = 12
    if (edad >= 18 && edad <= 65) {
        println("Eres una persona en edad laboral. 👷🏻‍♂️")
    } else if (edad < 18)  {
        println("Eres un menor de edad. 👶🏻")
    } else {
        println("Eres un abuelit@ 🤶🏻.")
    }


}
