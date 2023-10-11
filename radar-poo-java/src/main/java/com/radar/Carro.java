package com.radar;

public class Carro {

    // Atributos:
    String nome;
    String marca;
    String placa;
    String radar;
    int ano;
    int vel;

    // Metodos:
    void acelerar(int aceleracao) {
        vel += aceleracao;
    }

    void frear(int reduzir) {
        vel -= reduzir;
    }

    public void radar() {

        if (vel > 40) {
            System.out.println("Carro autuado: " + vel+"km/h");
        }else{
            System.out.println("Carro não autuado:" + vel+"km/h");
        }
    }
}
