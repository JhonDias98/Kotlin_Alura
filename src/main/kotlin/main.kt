fun main() {
    println("Bem vindo ao Bytebank")

    //Labels: informa a propriedade no argumento "titular="
    val conta1 = Conta(titular ="Jonathan Dias", numero = 1000)
    conta1.depositar(300.0)

    val conta2 = Conta(titular = "Maria", numero = 500)
    conta2.depositar(50.0)

    conta1.transferir(contaDestino = conta2, valor = 200.0)

    println(conta1.saldo)
    println(conta2.saldo)

}

//Criando a classe já com um construtor primário e os atributos da classe
class Conta(
    var titular: String,
    val numero: Int) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double ) {
        if(valor > 0) {
            this.saldo += valor
        }
    }

    fun sacar(valor: Double): Boolean {
        if(this.saldo >= valor) {
            this.saldo -= valor
            return true
        }
        return false
    }

    fun transferir(contaDestino: Conta, valor: Double) {
        if(this.sacar(valor)) {
            contaDestino.depositar(valor)
        }
    }
}

//Variáveis var e val
fun varVal() {
    //var: valor pode ser modificado
    //val: valor não pode ser modificado
    val titular: String = "Jonathan Dias"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100.0
    println("Titular: $titular, conta: $numeroConta, saldo: $saldo") //concatenação
}

//Condição when
fun testaCondicoes(saldo: Double) {
    //when equivalente ao IF/Switch Case
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 ->  println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}

//Loop
fun testaLoop() {
    //step: quantidade que vai aumentar/diminuir
    //X(menor)..Y(maior): incrementa
    for(i in 0..10 step 2) {
        println(i)

        //usar 'continue' para pular o loop atual
        if (i == 6) {
            continue
        }
    }
    //downTo: decrementa
    for(i in 10 downTo 1 ) {
        println(i)

        //usar 'break' para interromper o for
        if (i == 8) {
            break
        }
    }
}


