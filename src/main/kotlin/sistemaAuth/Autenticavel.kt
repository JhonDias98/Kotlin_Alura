package sistemaAuth

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}