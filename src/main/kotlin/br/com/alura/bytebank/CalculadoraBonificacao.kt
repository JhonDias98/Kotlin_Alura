package br.com.alura.bytebank

import br.com.alura.bytebank.funcionario.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }

    /**
     * O problema de utulizar da forma abaixo é que pode passar qualquer valor no arguemento por ser Any
     */
    fun registraAny(funcionario: Any) {
        funcionario as Funcionario //Cast de Any para funcionário
        this.total += funcionario.bonificacao
    }

    /**
     * Já aqui ele verifica com 'is' se o argumento passado é um funcionário
     */
    fun registraAnyIs(funcionario: Any) {
        if(funcionario is Funcionario) {
            this.total += funcionario.bonificacao
        }
    }
}