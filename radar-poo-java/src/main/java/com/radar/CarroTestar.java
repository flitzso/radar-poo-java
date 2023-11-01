package com.radar;

public class CarroTestar {

    public static void main(String[] args) {

        Carro c1 = new Carro();

        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.placa = "0000-AAA";
        c1.ano = 2015;
        c1.vel = 60;
        c1.radar = "";

        c1.acelerar(0);
        c1.radar();
        System.out.println("Modelo: " + c1.nome + "\nMarca: " + c1.marca + "\nPlaca: " + c1.placa + "\nAno: " + c1.ano);
    }
}
