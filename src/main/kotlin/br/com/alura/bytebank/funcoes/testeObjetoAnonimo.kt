package br.com.alura.bytebank.funcoes

import br.com.alura.bytebank.sistemaAuth.Autenticavel

fun testeObjetoAnonimo() {
    //object expression
    val jon = object: Autenticavel{
        val nome: String = "Jon"
        val cpf: String = "111.222.333-44"
        val senha: Int = 1000

        override fun autentica(senha: Int): Boolean {
            TODO("Not yet implemented")
        }
    }

}