package OtraManera;

public class Hilo extends Thread {
    static int cantidad = 50;
    static boolean dentro = false;

    public static int getCantidad() {
        return cantidad;
    }

    public static void setCantidad(int cantidad) {
        Hilo.cantidad = cantidad;
    }

    public Hilo(String str) {
        super (str);
    }

    public void run() {
        System.out.println("La cantidad inicial es: " + cantidad);

        synchronized (this) {
            if(getName().equals("ingreso")){
                if (dentro = true) {
                    for (int i = 0; i < 11; i++) {
                        setCantidad(getCantidad() + 10);
                        System.out.println("La cantidad final es suma: " + cantidad);
                    }

                    //System.out.println("La cantidad final es: " + cantidad);
                }
            }
            if(getName().equals("extracción")){
                if (dentro = true) {
                    for (int i = 0; i < 6; i++) {
                        setCantidad(getCantidad() - 5);
                        System.out.println("La cantidad final es resta: " + cantidad);
                    }

                    //System.out.println("La cantidad final es: " + cantidad);
                }
            }

        }
    }
}



