import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val baseRetangulo = 5.0
    val alturaRetangulo = 8.0

    val ladoTrianguloEquilatero = 4.0
    val baseTrianguloIsosceles = 4.0
    val alturaTrianguloIsosceles = 9.0
    val lado1TrianguloEscaleno = 7.0
    val lado2TrianguloEscaleno = 9.0
    val lado3TrianguloEscaleno = 12.0

    val raioCircunferencia = 3.0

    val diagonal1Losango = 10.0
    val diagonal2Losango = 6.0

    val baseTrapezio = 8.0
    val topoTrapezio = 5.0
    val alturaTrapezio = 4.0

    val areaRetangulo = calcularAreaRetangulo(baseRetangulo, alturaRetangulo)
    val areaTrianguloEquilatero = calcularAreaTrianguloEquilatero(ladoTrianguloEquilatero)
    val areaTrianguloIsosceles = calcularAreaTrianguloIsosceles(baseTrianguloIsosceles, alturaTrianguloIsosceles)
    val areaTrianguloEscaleno = calcularAreaTrianguloEscaleno(lado1TrianguloEscaleno, lado2TrianguloEscaleno, lado3TrianguloEscaleno)
    val areaCircunferencia = calcularAreaCircunferencia(raioCircunferencia)
    val areaLosango = calcularAreaLosango(diagonal1Losango, diagonal2Losango)
    val areaTrapezio = calcularAreaTrapezio(baseTrapezio, topoTrapezio, alturaTrapezio)

    println("Área do Retângulo: $areaRetangulo")
    println("Área do Triângulo Equilátero: $areaTrianguloEquilatero")
    println("Área do Triângulo Isósceles: $areaTrianguloIsosceles")
    println("Área do Triângulo Escaleno: $areaTrianguloEscaleno")
    println("Área da Circunferência: $areaCircunferencia")
    println("Área do Losango: $areaLosango")
    println("Área do Trapézio: $areaTrapezio")
}

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado.pow(2)
}

fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEscaleno(lado1: Double, lado2: Double, lado3: Double): Double {
    val s = (lado1 + lado2 + lado3) / 2
    return sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
}

fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * raio.pow(2)
}

fun calcularAreaLosango(diagonal1: Double, diagonal2: Double): Double {
    return (diagonal1 * diagonal2) / 2
}

fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) / 2) * altura
}
