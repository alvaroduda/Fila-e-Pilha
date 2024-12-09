import java.util.Stack;

public class Pilha {


    public static void main(String[] args) {

        //criação de uma pilha que ira armazenar valores String
        Stack <String> pilha = new Stack<>();

        //o Metodo push() adiciona um item na pilha
        pilha.push("Carro");
        pilha.push("Moto");
        pilha.push("Casa");
        pilha.push("Dinheiro");
        pilha.push("Emprego");

        //o Metodo peek() retorna o item no topo da pilha
        System.out.println(pilha.peek());

        //o Metodo pop() retorna o item no topo da pilha mas remove-o
        System.out.println(pilha.pop());

        System.out.println(pilha);


        //o Metodo empty() verifica se a pilha está vazia (retorna true) ou se a pilha tem itens (retorna false)
        if (pilha.empty()) {
            System.out.println("Pilha vazia");
        }
        else {
            System.out.println("Pilha com elementos");
        }

        //o Metodo clear() é para limpar/remover todos os itens da pilha
        pilha.clear();

        if (pilha.empty()) {
            System.out.println("Pilha vazia");
        }
        else {
            System.out.println("Pilha com elementos");
        }

    }


}