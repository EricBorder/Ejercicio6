package OtraManera;

public class Main {
    static boolean dentro = false;

    public static void main(String[] args) {
        Hilo suma = new Hilo("ingreso");
        Hilo resta = new Hilo("extracción");
        suma.start();
        resta.start();

        synchronized (suma) {
            while (dentro) {
                try {
                    suma.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            suma.notify();
        }
        synchronized (resta) {
            while (dentro) {
                try {
                    resta.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            resta.notify();
        }

    }
}
