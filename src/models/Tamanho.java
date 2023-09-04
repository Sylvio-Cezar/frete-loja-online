package models;

import interfaces.RegraFrete;
import regrasfretes.RegraTamanhoGrande;
import regrasfretes.RegraTamanhoMedio;
import regrasfretes.RegraTamanhoPequeno;

public enum Tamanho {
    PEQUENO(new RegraTamanhoPequeno()),
    MEDIO(new RegraTamanhoMedio()),
    GRANDE(new RegraTamanhoGrande());

    private RegraFrete regraFrete;

    Tamanho(RegraFrete regraFrete) {
        this.regraFrete = regraFrete;
    }

    public RegraFrete getRegraFrete() {
        return this.regraFrete;
    }
}
