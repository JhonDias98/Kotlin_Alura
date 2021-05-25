package br.com.alura.bytebank.funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
): FuncionarioAdmin( //Gerente herdando de Funcionario
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    //Override: sobrescreve o método/propriedade da classe pai(funcionário)
    override val bonificacao: Double
        get() {
            return salario * 0.2//Super: reutiliza a implementação da classe pai
        }
}