import java.util.LinkedList;
import java.util.Queue;

public class EjemploCola {
    public static void main(String[] args) {

        // Creamos una cola que almacenará elementos de tipo String (texto)
        // Usamos LinkedList porque Queue es una interfaz, y LinkedList la implementa
        Queue<String> cola = new LinkedList<>();

        // ---------- Agregar elementos a la cola ----------
        cola.add("A"); // Agregamos el primer elemento
        cola.add("B"); // Agregamos el segundo elemento
        cola.add("C"); // Agregamos el tercero

        // Mostramos el contenido completo de la cola
        System.out.println("Cola completa: " + cola);
        // En este punto, la cola tiene: [A, B, C]
        // A fue el primero en entrar y está al frente

        // ---------- Ver el primer elemento ----------
        // El método peek() muestra el primer elemento SIN quitarlo
        System.out.println("Primer elemento: " + cola.peek());
        // Resultado: "A"

        // ---------- Eliminar un elemento ----------
        // El método poll() elimina el primer elemento agregado (el frente)
        cola.poll();
        // Ahora la cola tiene: [B, C]

        // Mostramos nuevamente la cola para ver el cambio
        System.out.println("Cola después de eliminar un elemento: " + cola);
        // Resultado: [B, C]
    }
}
