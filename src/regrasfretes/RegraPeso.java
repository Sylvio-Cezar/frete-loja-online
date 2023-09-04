package regrasfretes;

import interfaces.RegraFrete;
import models.Produto;

public class RegraPeso implements RegraFrete {
    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 2.0;
    }
}
