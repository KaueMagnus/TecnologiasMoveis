enum class CorIngles {
    BLUE, RED, GREEN, YELLOW
}

fun traduzirCor(cor: CorIngles): String {
    return when (cor) {
        CorIngles.BLUE -> "azul"
        CorIngles.RED -> "vermelho"
        CorIngles.GREEN -> "verde"
        CorIngles.YELLOW -> "amarelo"
    }
}

fun main() {
    println("Digite uma cor em inglês (blue, red, green, yellow):")
    val colorInput = readLine()?.uppercase()

    val traducao = try {
        val cor = CorIngles.valueOf(colorInput!!)
        traduzirCor(cor)
    } catch (e: IllegalArgumentException) {
        "Cor não reconhecida"
    }

    println("Tradução: $traducao")
}
