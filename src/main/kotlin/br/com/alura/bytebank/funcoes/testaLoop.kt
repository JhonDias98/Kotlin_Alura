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