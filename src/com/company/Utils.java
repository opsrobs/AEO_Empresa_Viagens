package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Utils {
    private ArrayList<Vendedor> listaVendedor= new ArrayList<>();

    public void adicionarVendedores(Vendedor vendedor){
        this.listaVendedor.add(vendedor);
    }
    public String NomeVendedor(){
        return JOptionPane.showInputDialog("Informe o nome do vendedor! ");

    }
    public double qtdQulometros(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe quantos quilometros tem a viagem: "));
    }
    public int duracaoViagem(){
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a duração da viagem [em dias]: "));
    }
    public double valorDasVendas(){
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor das vendas desta viagem"));
    }

    public double calcularValorRodadoPorMes(double km){
        double valorPorKm=0;
        if (km <801){
            valorPorKm=km*0.40;
        }else if(km < 1600){
            valorPorKm=km*0.38;
        }else
            valorPorKm=km*0.35;
        return valorPorKm;
    }

    public String cadastro(){

        int opcao=Integer.parseInt(JOptionPane.showInputDialog("1- Nova viagem!\n3-SAIR")) ;
        String acao="";
        switch (opcao){
            case 1:
                acao="";
                break;
            case 2: acao="fim";
                break;
        }
        return acao;
    }

    public String viagemMenorKm(){
        String viagem="";
        double km=this.listaVendedor.get(0).getListaViagem().get(0).getQuilometros();
        for (int i = 0; i < this.listaVendedor.size(); i++) {
            for (int j = 0; j < this.listaVendedor.get(i).getListaViagem().size(); j++) {
                if (km>=this.listaVendedor.get(i).getListaViagem().get(j).getQuilometros()){
                    km=this.listaVendedor.get(i).getListaViagem().get(j).getQuilometros();
                    viagem=this.listaVendedor.get(i).getNome().toString()+
                            this.listaVendedor.get(i).getListaViagem().get(j).toString();
                }
            }
        }
        return viagem;
    }

    public String maiorValor(){
        String viagem="";
        double km=this.listaVendedor.get(0).getListaViagem().get(0).getValorVendas();
        for (int i = 0; i < this.listaVendedor.size(); i++) {
            for (int j = 0; j < this.listaVendedor.get(i).getListaViagem().size(); j++) {
                if (km<=this.listaVendedor.get(i).getListaViagem().get(j).getValorVendas()){
                    km=this.listaVendedor.get(i).getListaViagem().get(j).getValorVendas();
                    viagem=this.listaVendedor.get(i).getNome().toString()+
                            this.listaVendedor.get(i).getListaViagem().get(j).toString();
                }
            }
        }
        return viagem;
    }

    public double apresentarValorPago(){
        double totalkm=0;
        for (int i = 0; i < listaVendedor.size(); i++) {
            for (int j = 0; j < this.listaVendedor.get(i).getListaViagem().size(); j++) {
                totalkm+=this.listaVendedor.get(i).getListaViagem().get(j).getQuilometros();
            }
        }

        return this.calcularValorRodadoPorMes(totalkm);
    }

    public String maiorValorTotalMes(){
        String vendas="";

        for (int i = 0; i < this.listaVendedor.size(); i++) {
            for (int j = 0; j < this.listaVendedor.get(i).getListaViagem().size(); j++) {

            }

        }
        return vendas;
    }


}
