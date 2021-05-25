package br.com.alura.bytebank.conta

import br.com.alura.bytebank.funcionario.Cliente

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}