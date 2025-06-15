package org.example;

import org.example.entities.Carro;
import org.example.entities.Motor;

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor("V8", 500);
        Carro carro = new Carro("Mustang", motor);

        carro.exibirInformacoes();
    }
}