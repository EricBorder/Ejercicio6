package PrimerIntento;

public class Hilo extends Thread {
    static int cantidad = 50;

    public Hilo(String str) {
        super(str);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void run() {
        System.out.println("La cantidad inicial es: " + cantidad);
        if (getName().equals("ingreso")) {
            for (int i = 0; i < 11; i++) {
                setCantidad(getCantidad() + 10);
            }
            System.out.println("El salario es " + cantidad);

        }
        if (getName().equals("extracción")) {
            for (int i = 0; i < 6; i++) {
                setCantidad(getCantidad() - 10);

            }
            System.out.println("El salario es " + cantidad);
        }

    }
}
