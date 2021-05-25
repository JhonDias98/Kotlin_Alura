package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.funcionario.endereco.Endereco

fun testaSafeCall_Nuloes() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "rua vergueiro", complemento = "prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let { //Let: joga o objeto para dentro de uma função
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}
