package com.example;

public class Precio {
    public static void main(String[] args) {
        double valorIVA = (int) calculaIva(20);
        System.out.println(valorIVA);
    }

    private static double calculaIva(int precio) {
        int iva = 21;

        return (iva * precio) / 100;
    }
}
