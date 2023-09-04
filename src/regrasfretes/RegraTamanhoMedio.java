package regrasfretes;

import interfaces.RegraFrete;
import models.Produto;

public class RegraTamanhoMedio implements RegraFrete {
    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 5.0;
    }
}
