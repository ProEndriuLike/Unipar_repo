fun main() {

    //Declare variáveis para armazenar os dados

    var nome: String? = null
    var idade: Int? = null
    var salarioMensalBruto: Double? = null
    var mesesTrabalhados: Int? = null
    var produtosComprados: Int? = null

    //Atribua valores apropriados a cada uma das variáveis

    nome = "João"
    idade = 34
    salarioMensalBruto = 3700.0
    mesesTrabalhados = 9
    produtosComprados = 34

    var salarioAnualBruto: Double = salarioMensalBruto * mesesTrabalhados

    val descontoFixo: Double = 950.0
    var salarioAnualLiquido: Double = salarioAnualBruto - descontoFixo
    var mensagemPersonalizada: String = "Nome: $nome; Salário anual líquido: $salarioAnualLiquido"

    println("Nome: $nome")
    println("Idade: $idade")
    println("Salario Mensal Bruto: $salarioMensalBruto")
    println("Meses Trabalhados: $mesesTrabalhados")
    println("Produtos Comprados: $produtosComprados")
    println("Salário Anual Bruto: $salarioAnualBruto")
    println("Desconto Fixo: $descontoFixo")
    println("Salário Anual Líquido: $salarioAnualLiquido")
    println(mensagemPersonalizada)

}
