package br.com.alura.bytebank.conta

import br.com.alura.bytebank.funcionario.Cliente

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun sacar(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}