package com.company;

public class Viagem {
    private int duracao;
    private double quilometros;
    private double valorVendas;

    public Viagem(int duracao, double quilometros, double valorVendas) {
        this.duracao = duracao;
        this.quilometros = quilometros;
        this.valorVendas = valorVendas;
    }


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(double quilometros) {
        this.quilometros = quilometros;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "Duracao=" + duracao +
                ", Quilometros=" + quilometros +
                ", Valor das Vendas=" + valorVendas +
                '}';
    }
}
