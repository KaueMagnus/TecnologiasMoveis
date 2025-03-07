package exercise1

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    if (numbers?.size == 5) {
        println("A média dos números é: %.2f".format(numbers.average()))
    } else {
        println("Entrada inválida. Insira exatamente 5 números inteiros.")
    }
}
