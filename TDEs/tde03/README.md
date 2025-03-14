## 📌 TDE Aula 03 - Exercícios com Kotlin (Conceitos de classes)

## 📚 Disciplina
**Professor:** Daniel Souza

## 📝 Descrição
Este repositório contém quatro exercícios implementados em Kotlin, abordando conceitos como classes, sealed classes e data classes.

## 🚀 Exercícios

### 1️⃣ **CharGenerator**
Classe responsável por gerar caracteres aleatórios dentro de um intervalo especificado.
- Recebe dois caracteres (`min` e `max`) no construtor primário.
- Método `generateChar()`: Retorna um caractere aleatório entre `min` e `max`.

### 2️⃣ **Pessoa**
Classe que representa uma pessoa com comportamento básico.
- Possui atributos `nome` e `idade`.
- Métodos:
    - `caminhar()`: Exibe "caminhando".
    - `falar()`: Exibe "falando".

### 3️⃣ **Sealed Class Result**
Classe selada que representa o resultado de uma operação.
- Subclasses:
    - `Sucesso<T>`: Armazena um valor genérico de sucesso.
    - `Error`: Armazena uma mensagem de erro.
    - `Loading`: Representa um estado de carregamento.

### 4️⃣ **Data Class Pessoa**
Classe de dados que representa uma pessoa com informações imutáveis.
- Atributos: `nome`, `idade`, `profissao`, `cpf`.
- Uso do método `copy()` para criar uma nova instância alterando apenas o nome.

## ✨ Tecnologias Utilizadas
- Kotlin

## 📌 Autor
- Kaue Marques Magnus

