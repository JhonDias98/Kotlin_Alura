package br.com.alura.bytebank.funcionario

//Abstract: não pode ser instanciado
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
) {
//    //Open: aberto para ser sobrescrevido nas classes filhas
//    open val bonificacao: Double get() = salario * 0.1 //usando como propriedade
//    open fun bonifica(): Double = salario * 0.1 //usando como método

    //Quando um métodos ou atributo é abstrado, as classes filhas são obrigadas a implementar
    abstract val bonificacao: Double

}