public class Pila {
    private int max;       // Tamaño máximo de la pila
    private int tope;      // Índice del elemento superior
    private int[] pila;    // Arreglo para guardar los datos

    public Pila(int tamaño) {
        max = tamaño;
        pila = new int[max];
        tope = -1;
    }

    // Agregar elemento (push)
    public void push(int dato) {
        if (tope < max - 1) {
            tope++;
            pila[tope] = dato;
        } else {
            System.out.println("Pila llena");
        }
    }

    // Quitar elemento (pop)
    public int pop() {
        if (tope >= 0) {
            int dato = pila[tope];
            tope--;
            return dato;
        } else {
            System.out.println("Pila vacía");
            return -1;
        }
    }

    // Mostrar la pila
    public void mostrar() {
        if (tope >= 0) {
            System.out.print("Pila: ");
            for (int i = 0; i <= tope; i++) {
                System.out.print(pila[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Pila vacía");
        }
    }

    public static void main(String[] args) {
        Pila p = new Pila(5);
        p.push(10);
        p.push(20);
        p.push(30);
        p.mostrar();
        p.pop();
        p.mostrar();
    }
}