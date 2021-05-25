import funcionario.Diretor
import funcionario.Funcionario
import funcionario.Gerente

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}