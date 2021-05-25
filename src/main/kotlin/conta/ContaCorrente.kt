package conta

class ContaCorrente(
    titular: String,
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