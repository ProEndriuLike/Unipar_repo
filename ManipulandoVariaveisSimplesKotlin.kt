fun main() {

    var idade: Int? = null;
    var altura: Double? = null;
    var nome: String? = null;
    var eEstudante: Boolean? = null;

    idade = 20
    altura = 1.85
    nome = "Endriu"
    eEstudante = true

    var idade2: Int = 18
    var somaIdades: Int = idade + idade2

    var dobroAltura: Double = altura * 2

    var saudacao: String = "Olá $nome!"

    println("Nome: $nome")
    println("Altura: $altura")
    println("Idade: $idade anos")
    println("É estudante? $eEstudante")
    println("Soma das idades: $somaIdades")
    println("Altura dobrada: $dobroAltura")
    println(saudacao)
}
