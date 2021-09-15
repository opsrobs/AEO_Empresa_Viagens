package com.company;

import java.util.ArrayList;

public class Vendedor {
    private String nome;
    private ArrayList<Viagem>listaViagem = new ArrayList<>();

    public Vendedor(String nome) {
        this.nome = nome;

    }
    public Vendedor(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public ArrayList<Viagem> getListaViagem() {
        return listaViagem;
    }

    public void setListaViagem(ArrayList<Viagem> listaViagem) {
        this.listaViagem = listaViagem;
    }

    public void adicionarViagens(int duracao, double km,double vendas){
        this.listaViagem.add(new Viagem(duracao,km,vendas));
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Nome='" + nome + '\'' +
                ", listaViagem=" + listaViagem +
                '}';
    }
}
