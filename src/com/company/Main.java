package com.company;

public class Main {

    public static void main(String[] args) {
	Vendedor vendedor;
    Utils utils = new Utils();
    String nome= utils.NomeVendedor();
    double kms;
    int duracao;
    double vendas;

    while (!nome.equalsIgnoreCase("fim")){
        vendedor =new Vendedor(nome);
        utils.adicionarVendedores(vendedor);
        while (!nome.equalsIgnoreCase("fim")){
            kms= utils.qtdQulometros();
            duracao = utils.duracaoViagem();
            vendas= utils.valorDasVendas();
            vendedor.adicionarViagens(duracao,kms,vendas);
            nome=utils.cadastro();
        }
        nome= utils.NomeVendedor();

    }
        System.out.println(utils.apresentarValorPago());
        System.out.println(utils.viagemMenorKm());
        System.out.println(utils.maiorValor());
    }
}
