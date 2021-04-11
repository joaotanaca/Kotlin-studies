fun formatStrings() {
    println("-------------------------------------")
    println("Formatação de Strings\n")
    val frase = "Kotlin é daora pra caramba"
    // Caso a variavel não mude melhor declarar com val se não declarar com var
    val notaDaLinguagem = "10!"
    println("$frase com nota de $notaDaLinguagem \n")
    //Criação de mais de uma linha com string sem concatenação
    val semConcatenar = """
        Teste de 
        Pulagem de 
        Linha
    """.trimIndent()
    println("$semConcatenar \n")
    //Caso aja uma complexidade ou alguma logica para a mostragem da string deve se usar {}
    println("${semConcatenar.length} \n")
}

fun mutableVariables() {
    println("-------------------------------------")
    // Apesar de val ser final pro java você pode declarar o valor depois de inicializar
    val frase: String = "Amendoim"
    println("Mutação de variaveis final: $frase \n")
}

//Funções com uma linha
fun showHalfLengthString(word: String) = println("${word.length / 2} \n")

//Teste operação ternaria
fun testOperatorTernary(value: Int) {
    println("-------------------------------------")
    println("Teste de ternario dentro de chaves na string\n")
    println("Olá ${if (value >= 10) "velho" else "jovem"}\n")
}

//Teste de operador Elvis, que é identico ao null coalecing
fun operatorElvisEqualNullCoalecing(value: String? = null) = println("O valor da string é ${value ?: "sem valor"}\n")

//Operador When, tem uso semelhante ao switch case porém pode ser atribuida numa variavel o retorno dessa decição
fun whenTest(a: Int, b: Int, c: String) {
    println("-------------------------------------")
    println("Estrutura de decisão when\n")
    val result: Int = when (c) {
        "Soma" -> {
            println("Soma")
            a + b;
        }
        "Subitração" -> {
            println("Subitração")
            if (a < b) {
                b - a
            } else a - b
        }
        // Valor default no switch case é igual ao else no when
        else -> 0
    }
    println("$result \n")
}

//Teste de intervalo de valores no when
fun rangeInWhen(a: Int, b: Int) {
    println("-------------------------------------")
    println("Teste de intervalo de valores\n")
    when {
        a + b in 10..40 -> {
            println("Soma dos dois valores está dentro de 10 e 40 \n")
        }
        else -> {
            println("Não está dentro de 10 e 40\n")
        }
    }
}

fun jumpIndexsInFor(number: Int = 1) {
    println("-------------------------------------")
    println("Executando o estruturar de repetição pulando de $number\n")
    for (i in 0..100 step number) {
        println("$i")
    }
}

fun downToFor(number: Int = 1) {
    println("-------------------------------------")
    println("Executando o estruturar de repetição do maior pro menor pulando de $number\n")
    for (i in 100 downTo 0 step number) {
        println("$i")
    }
}

fun <T> media(vararg notes: T) {
    println("-------------------------------------")
    for (valor in notes) println(valor)
}

fun main() {
    formatStrings()
    mutableVariables()
    println("-------------------------------------")
    println("Criação de funções de uma linha\n")
    showHalfLengthString("Criação de funções de uma linha")
    testOperatorTernary(11)
    println("-------------------------------------")
    println("Teste de operador Elvis\n")
    operatorElvisEqualNullCoalecing()
    operatorElvisEqualNullCoalecing("Teste")
    whenTest(10, 20, "Soma")
    whenTest(10, 20, "Subitração")
    whenTest(45, 32, "Subitração")
    rangeInWhen(10, 30)
    rangeInWhen(10, 40)
    jumpIndexsInFor(10)
    downToFor(10)
    media(10f, 10f, 20f, 30f)
    media(10, 10, 20, 30)
}
