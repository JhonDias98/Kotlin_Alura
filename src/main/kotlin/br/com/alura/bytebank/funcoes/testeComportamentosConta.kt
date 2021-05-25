import br.com.alura.bytebank.conta.ContaCorrente
import br.com.alura.bytebank.conta.ContaPoupanca
import br.com.alura.bytebank.funcionario.Cliente

fun testaComportamentosConta(){
    //Labels: informa a propriedade no argumento "titular="
    val conta1 = ContaCorrente(titular = Cliente(nome = "jonathan", cpf = "111.222.333-44", senha = 123),
                                numero = 1000)
    conta1.depositar(300.0)

    val conta2 = ContaPoupanca(titular = Cliente(nome = "maria", cpf = "444.333.222-11", senha = 123),
                                numero = 500)
    conta2.depositar(50.0)

    conta1.transferir(destino = conta2, valor = 200.0)

    println(conta1.saldo)
    println(conta2.saldo)
}
