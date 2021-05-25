package br.com.alura.bytebank.sistemaAuth

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}