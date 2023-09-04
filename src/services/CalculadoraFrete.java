package services;

import models.Produto;

public class CalculadoraFrete {
    public double calcularFrete(Produto produto) {
        return produto.getTamanho().getRegraFrete().calcular(produto) + produto.getTaxaPorKg();
    }
}
