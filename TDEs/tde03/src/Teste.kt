import exercise1.CharGenerator
import exercise2.Pessoa
import exercise3.Result
import exercise4.Pessoa2

class Teste {
    fun main() {
        // EXERCICIO 1
        val generator = CharGenerator('a', 'z')
        println(generator.generateChar())

        // EXERCICIO 2
        val pessoa2 = Pessoa("João", 30)
        pessoa2.caminhar()
        pessoa2.falar()

        // EXERCICIO 3
        val resultado: Result = Result.Sucess("Sucesso")
        when(resultado) {
            Result.Error -> println("Error")
            Result.Loading -> println("Loading")
            is Result.Sucess -> println(resultado.data)
        }

        // EXERCICIO 4
        val pessoa = Pessoa2("João", 30, "Engenheiro", "123.456.789-00")
        val novaPessoa = pessoa.copy(nome = "João da Silva")

        println("Pessoa original: $pessoa")
        println("Nova pessoa: $novaPessoa")
    }
}