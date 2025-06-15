package org.example.entities;

public class Carro {

    private String modelo;
    private Motor motor; // Composição

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor.getTipo() + " - " + motor.getPotencia() + "cv");
    }
}