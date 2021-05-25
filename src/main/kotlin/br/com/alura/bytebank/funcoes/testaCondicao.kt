fun testaCondicao(saldo: Double) {
    //when equivalente ao IF/Switch Case
    when {
        saldo > 0.0 -> println("Saldo positivo")
        saldo == 0.0 ->  println("Saldo neutro")
        else -> println("Saldo negativo")
    }
}
