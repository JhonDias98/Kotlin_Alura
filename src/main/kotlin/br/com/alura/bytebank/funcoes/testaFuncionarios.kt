package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.funcionario.Analista
import br.com.alura.bytebank.funcionario.Diretor

fun testaFuncionarios() {
    val jonathan = Analista(
        nome = "Jonathan",
        cpf = "111.222.333-66",
        salario = 2500.0,
        senha = 124
    )

    val joao = Diretor(
        nome = "Joao",
        cpf = "111.222.333-66",
        salario = 4500.0,
        plr = 2000.0,
        senha = 123
    )

    println(jonathan.bonificacao)
}