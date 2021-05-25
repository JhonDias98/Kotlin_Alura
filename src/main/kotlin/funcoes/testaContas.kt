package funcoes

import conta.ContaCorrente
import conta.ContaPoupanca

fun testaContas() {
    val contaCorrente = ContaCorrente(
        titular = "Jonathan",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "João",
        numero = 1001
    )

    contaCorrente.depositar(1000.0)
    contaCorrente.sacar(150.0)

    contaPoupanca.depositar(1000.0)
    contaPoupanca.sacar(150.0)

    println(contaCorrente.saldo)
    println(contaPoupanca.saldo)
}