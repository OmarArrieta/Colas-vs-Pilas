public class Cola {
    private int max;
    private int frente;
    private int fin;
    private int[] cola;

    public Cola(int tamaño) {
        max = tamaño;
        cola = new int[max];
        frente = 0;
        fin = -1;
    }

    // Agregar elemento (enqueue)
    public void encolar(int dato) {
        if (fin < max - 1) {
            fin++;
            cola[fin] = dato;
        } else {
            System.out.println("Cola llena");
        }
    }

    // Quitar elemento (dequeue)
    public int desencolar() {
        if (frente <= fin) {
            int dato = cola[frente];
            frente++;
            return dato;
        } else {
            System.out.println("Cola vacía");
            return -1;
        }
    }

    // Mostrar la cola
    public void mostrar() {
        if (frente <= fin) {
            System.out.print("Cola: ");
            for (int i = frente; i <= fin; i++) {
                System.out.print(cola[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Cola vacía");
        }
    }

    public static void main(String[] args) {
        Cola c = new Cola(5);
        c.encolar(10);
        c.encolar(20);
        c.encolar(30);
        c.mostrar();
        c.desencolar();
        c.mostrar();
    }
}
