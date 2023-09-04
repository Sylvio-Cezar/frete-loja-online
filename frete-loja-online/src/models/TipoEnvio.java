package models;

import interfaces.RegraFrete;
import regrasfretes.RegraPeso;
import regrasfretes.RegraPreco;
import regrasfretes.RegraTamanho;

public enum TipoEnvio {
    PESO(new RegraPeso()),
    PRECO(new RegraPreco()),
    TAMANHO(new RegraTamanho());

    private RegraFrete regraFrete;

    TipoEnvio(RegraFrete regraFrete) {
        this.regraFrete = regraFrete;
    }

    public RegraFrete getRegraFrete() {
        return this.regraFrete;
    }
}
