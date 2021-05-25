import conta.Conta
import conta.ContaCorrente
import conta.ContaPoupanca

fun testaComportamentosConta(){
    //Labels: informa a propriedade no argumento "titular="
    val conta1 = ContaCorrente(titular = "Jonathan Dias", numero = 1000)
    conta1.depositar(300.0)

    val conta2 = ContaPoupanca(titular = "Maria", numero = 500)
    conta2.depositar(50.0)

    conta1.transferir(destino = conta2, valor = 200.0)

    println(conta1.saldo)
    println(conta2.saldo)
}
