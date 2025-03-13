package exercise1

class CharGenerator(val min: Char, val max: Char) {
    init {
        require(min <= max) { "O valor mínimo deve ser menor ou igual ao valor máximo" }
    }
    fun generateChar(): Char {
        return (min.code..max.code).random().toChar()
    }
}