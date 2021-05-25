package br.com.alura.bytebank.conta

import br.com.alura.bytebank.funcionario.Cliente
////Property global
//var totalContas = 0
//    private set

abstract class Conta(
    var titular: Cliente,
    val numero: Int) {
    var saldo = 0.0
        protected set //Com protected as classes filhas poderão alterar o valor do atributo
    //var total = 0
    companion object Contador { //Considera um membro próprio da classe
        var total = 0
        private set
    }

    //Init: quando a classe for usada o bloco do init será executado
    init {
        println("Criando conta")
        Contador.total++
    }

    fun depositar(valor: Double ) {
        if(valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.depositar(valor)
            return true
        }
        return false
    }
}