package br.com.alura.bytebank.funcionario

import br.com.alura.bytebank.funcionario.endereco.Endereco
import br.com.alura.bytebank.sistemaAuth.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}