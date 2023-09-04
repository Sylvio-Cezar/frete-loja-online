package regrasfretes;

import interfaces.RegraFrete;
import models.Produto;

public class RegraTamanho implements RegraFrete {
    @Override
    public double calcular(Produto produto) {
        return (produto.getAltura() * produto.getLargura() * produto.getProfundidade()) * 400.0;
    }
}
