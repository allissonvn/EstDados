
class Pilha {
    private int[] elementos; // Array para armazenar os elementos da pilha
    private int topo;        // Variável para controlar o topo da pilha

    // Construtor para inicializar a pilha com um tamanho máximo
    public Pilha(int tamanho) {
        elementos = new int[tamanho]; // Cria o array com o tamanho especificado
        topo = -1; // Inicializa o topo como -1 (pilha vazia)
    }

    // Método para verificar se a pilha está vazia
    public boolean estaVazia() {
        return topo == -1; // Se topo for -1, a pilha está vazia
    }

    // Método para verificar se a pilha está cheia
    public boolean estaCheia() {
        return topo == elementos.length - 1; // Se topo for igual ao último índice, está cheia
    }

    // Método para adicionar um elemento no topo da pilha (Push)
    public void push(int valor) {
        if (estaCheia()) {
            System.out.println("A pilha está cheia! Não é possível adicionar " + valor + ".");
        } else {
            topo++; // Move o topo para a próxima posição
            elementos[topo] = valor; // Adiciona o valor no topo
            System.out.println(valor + " foi adicionado à pilha.");
        }
    }

    // Método para remover o elemento do topo da pilha (Pop)
    public int pop() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia! Não é possível remover.");
            return -1; // Retorna -1 para indicar que a pilha está vazia
        } else {
            int valorRemovido = elementos[topo]; // Pega o valor do topo
            topo--; // Move o topo para baixo
            System.out.println(valorRemovido + " foi removido da pilha.");
            return valorRemovido;
        }
    }

    // Método para ver o elemento do topo da pilha sem removê-lo (Peek)
    public int peek() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia! Não há elementos para ver.");
            return -1; // Retorna -1 para indicar que a pilha está vazia
        } else {
            return elementos[topo]; // Retorna o valor do topo
        }
    }

    // Método para exibir a pilha
    public void exibir() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.print("Pilha: ");
            for (int i = 0; i <= topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}

