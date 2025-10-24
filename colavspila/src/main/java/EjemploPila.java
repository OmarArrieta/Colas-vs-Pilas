// Importamos la clase Stack desde el paquete java.util
import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {

        // Creamos una pila que almacenará elementos de tipo String (texto)
        Stack<String> pila = new Stack<>();

        // ---------- Agregar elementos a la pila ----------
        pila.push("A"); // Agregamos el elemento "A"
        pila.push("B"); // Agregamos el elemento "B"
        pila.push("C"); // Agregamos el elemento "C"

        // Mostramos el contenido completo de la pila
        System.out.println("Pila completa: " + pila);
        // En este punto, la pila tiene: [A, B, C]
        // C está en la parte superior (último elemento agregado)

        // ---------- Ver el elemento superior ----------
        // El método peek() muestra el último elemento agregado SIN eliminarlo
        System.out.println("Elemento en la cima: " + pila.peek());
        // Resultado: "C"

        // ---------- Eliminar un elemento ----------
        // El método pop() elimina el último elemento agregado (la cima)
        pila.pop();
        // Ahora la pila tiene: [A, B]

        // Mostramos nuevamente la pila para ver el cambio
        System.out.println("Pila después de eliminar un elemento: " + pila);
        // Resultado: [A, B]
    }
}
