package funcoes

fun main(args: Array<String>){
    for (n in ordenar(38, 3, 456, 8, 51, 1, 88, 73)){
        println("$n")
    }
}

fun ordenar(vararg numeros: Int): IntArray{
    //Vararg é como uma matriz, mas os valores podem ser passados por vírgula
    return numeros.sortedArray()
}