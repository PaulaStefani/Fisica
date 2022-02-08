class `Fisica` {
    fun calcularForcaPeso(massa: Float, aceleracaoDaGravidade: Float): Float {
        return massa * aceleracaoDaGravidade
    }

    fun forcaCentripeta(massaDoCorpo: Float, velocidadeDoCorpo: Float, raioDaTrajetoriaCircular: Float): Float {
        return massaDoCorpo * (velocidadeDoCorpo * velocidadeDoCorpo / raioDaTrajetoriaCircular)
    }

    fun impulso(forca: Float, tempoInicial: Byte, tempoFinal: Byte): Float {
        return forca *tempoFinal - tempoInicial
    }

    //    A = F.Δt =
    fun forcaElastica(k: Float, x: Float): Float {
        return k * x
    }

    fun velocidadeMedia(posicaoFinal: Float, posicaoInicial: Float, tempoFinal: Float, tempoInicial: Float): Float {
        return (posicaoFinal - posicaoInicial) / (tempoFinal - tempoInicial)
    }

    fun MRU(posicaoInicial: Float, velocidadeDeDeslocamento: Float, tempoDoDeslocamento: Float): Float {
        return posicaoInicial + velocidadeDeDeslocamento* tempoDoDeslocamento
    }
    //S (t) = S0 + v . t, em que:
    //-> S0 é posição inicial, no instante t = 0;
    //-> v é a velocidade de deslocamento;
    //-> t é o tempo do deslocamento.

    fun MRUV(velocidadeInicial: Float, aceleracao: Float, tempo: Float): Float {
        return velocidadeInicial + aceleracao * tempo
    }

    //V = v0 + a . t
    //v: velocidade (m/s)
    //vo: velocidade inicial (m/s)
    //a: aceleração (m/s2)
    //t: tempo (s)
    //Paula Stéfani Boeira Passos


}
