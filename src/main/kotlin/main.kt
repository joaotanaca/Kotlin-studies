fun main() {
    formatStrings()
    mutableVariables()
    println("-------------------------------------")
    println("Criação de funções de uma linha\n")
    showHalfLengthString("Criação de funções de uma linha")
    testOperatorTernary(11)}

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
    val frase: String
    // Apesar de val ser final pro java você pode declarar o valor depois de inicializar
    frase = "Amendoim"
    println("Mutação de variaveis final: $frase \n")
}

//Funções com uma linha
fun showHalfLengthString(word:String) = println("${word.length/2} \n")

fun testOperatorTernary(valor: Int) {
    println("-------------------------------------")
    println("Teste de ternario dentro de chaves na string\n")
    println("Olá ${if(valor >= 10) "velho" else "jovem"}\n")
}