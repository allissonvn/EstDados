public class Main {
    public static void main(String[] args) {
        // Cria uma pilha com tamanho máximo de 5
        Pilha pilha = new Pilha(5);

        // Adiciona elementos à pilha
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        // Exibe a pilha
        pilha.exibir();

        // Verifica o elemento no topo da pilha
        System.out.println("Elemento no topo da pilha: " + pilha.peek());

        // Remove elementos da pilha
        pilha.pop();
        pilha.pop();

        // Exibe a pilha novamente
        pilha.exibir();

        // Tenta remover de uma pilha vazia
        pilha.pop();
        pilha.pop(); // Isso vai mostrar uma mensagem de erro

        // Exibe a pilha final
        pilha.exibir();
    }
}