import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Usando el método add()
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        // Imprimir la cola
        System.out.println("Elementos de la cola : " + queue);

        // Eliminar el elemento usando remove()
        int removedElement = queue.remove();
        System.out.println("Elemento eliminado : " + removedElement);

        System.out.println("La cola después de remove : " + queue);

        // Ver el elemento del frente de la cola usando element()
        int head = queue.element();
        System.out.println("Cabeza de la cola : " + head);

        // Resto de la cola después de usar element()
        System.out.println("La cola después de element : " + queue);

        // Número de elementos en la cola : size()
        int size = queue.size();
        System.out.println("Tamaño de la cola : " + size);
    }
}
