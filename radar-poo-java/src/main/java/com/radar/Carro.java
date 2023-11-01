package com.radar;

public class Carro {

    String nome;
    String marca;
    String placa;
    String radar;
    int ano;
    int vel;

    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    public void radar() {

        if (vel > 40) {
            System.out.println("Carro autuado: " + vel +"Km/h");
        } else {
            System.out.println("Carro não autuado: " + vel +"Km/h");
        }
    }

}
