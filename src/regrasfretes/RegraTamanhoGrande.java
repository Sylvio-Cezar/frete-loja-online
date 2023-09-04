package regrasfretes;

import interfaces.RegraFrete;
import models.Produto;

public class RegraTamanhoGrande implements RegraFrete {
    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 7.5;
    }
}
