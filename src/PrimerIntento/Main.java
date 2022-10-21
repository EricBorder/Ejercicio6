package PrimerIntento;

import PrimerIntento.Hilo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hilo suma = new Hilo("ingreso");
        Hilo resta = new Hilo("extracción");

        suma.start();
        suma.join();

        resta.start();
        resta.join();
    }
}