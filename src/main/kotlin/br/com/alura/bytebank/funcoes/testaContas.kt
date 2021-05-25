package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.conta.ContaCorrente
import br.com.alura.bytebank.conta.ContaPoupanca
import br.com.alura.bytebank.funcionario.Cliente
import br.com.alura.bytebank.funcionario.endereco.Endereco

fun testaContas() {


    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "jonathan",
            cpf = "111.222.333-44",
            senha = 123,
            endereco = Endereco(
                cidade = "São Paulo"
            )
        ),
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "joao",
            cpf = "333.222.111-00",
            senha = 123,
            endereco = Endereco(
                logradouro = "Rua Aparecida"
            )
        ),
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaCorrente.sacar(150.0)

    contaPoupanca.depositar(1000.0)
    contaPoupanca.sacar(150.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
}