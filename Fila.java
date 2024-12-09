import java.util.LinkedList;
import java.util.Queue;

public class Fila {


    public static void main (String [] args){

        Queue <String> fila = new LinkedList<>();

        fila.add("Caneta");
        fila.add("Papel");
        fila.add("Tesoura");
        fila.add("Lápis");
        fila.add("Marca-Texto");

        //p Metodo peek retorna qual o primeiro item da fila
        System.out.println(fila.peek());

        System.out.println(fila);

        //o Metodo poll() retorna o item no topo da fila mas remove-o
        fila.poll();

        // o Metodo isEmpty() verifica se a fila está vazia (retorna true) ou se a fila está com itens (retorna false)
        if (fila.isEmpty()) {
            System.out.println("Fila vazia");
        }
        else {
            System.out.println("Fila com itens");
        }

    }


}
