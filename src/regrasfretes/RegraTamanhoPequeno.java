package regrasfretes;

import interfaces.RegraFrete;
import models.Produto;

public class RegraTamanhoPequeno implements RegraFrete {
    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 2.5;
    }
}
