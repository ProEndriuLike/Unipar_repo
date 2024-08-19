fun main() {

    var nomeProduto: String? = null
    var precoProduto: Double? = null
    var quantidadeProdutosComprados: Int? = null
    var impostoSobreProduto: Double? = null
    var margemLucro: Double? = null

    nomeProduto = "iPhone"
    precoProduto = 5000.0
    quantidadeProdutosComprados = 34
    impostoSobreProduto = 8.3
    margemLucro = 35.0
    var valorTotalSemImpostos: Double = precoProduto * quantidadeProdutosComprados

    var valorTotalComImpostos: Double = valorTotalSemImpostos * (impostoSobreProduto/100 + 1)
    var valorProdutoComImpostos: Double = valorTotalComImpostos / quantidadeProdutosComprados
    var precoDeVenda = valorProdutoComImpostos * (margemLucro/100 + 1)

    val precoDeVendaFinal: String = String.format("%.2f",precoDeVenda)

    var valorTotalFormatado: String = String.format("R$%.2f",valorTotalComImpostos)
    var precoDeVendaFormatado: String = "R$$precoDeVendaFinal"

    var mensagemFinal: String = "Nome: $nomeProduto\n" +
            "Valor Total Com Impostos: $valorTotalFormatado\n" +
            "Preço de Venda Sugerido: $precoDeVendaFormatado"

    println("Nome: $nomeProduto")
    println("Preço: $precoProduto")
    println("Quantidade de Produtos Comprados: $quantidadeProdutosComprados")
    println("Imposto Sobre Produto: $impostoSobreProduto%")
    println("Margem de lucro: $margemLucro%")
    println("Valor sem impostos: $valorTotalSemImpostos")
    println("Valor com impostos: $valorTotalComImpostos")
    println("Valor do Produto com Impostos: $valorProdutoComImpostos")
    println("Preço de Venda: $precoDeVenda")
    println("Preço de Venda Arredondado: $precoDeVendaFinal")
    println("Valor total Formatado: $valorTotalFormatado")
    println("Preço de Venda Formatado: $precoDeVendaFormatado")
    println("#Mensagem Final #")
    println(mensagemFinal)

}
