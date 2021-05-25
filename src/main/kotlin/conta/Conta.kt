package conta

abstract class Conta(
    var titular: String,
    val numero: Int) {
    var saldo = 0.0
        protected set //Com protected as classes filhas poderão alterar o valor do atributo

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