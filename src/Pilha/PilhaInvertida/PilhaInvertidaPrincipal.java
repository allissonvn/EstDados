package Pilha.PilhaInvertida;

public class PilhaInvertidaPrincipal {
    public static void main(String[] args) {
        Empilhavel pilha = new PilhaInvertida(5);

        System.out.println("Empilhando elementos:");
        pilha.empilhar("Primeiro");
        pilha.empilhar("Segundo");
        pilha.empilhar("Terceiro");

        System.out.println("Estado atual: " + pilha.imprimir());
        System.out.println("Topo: " + pilha.topo());

        System.out.println("\nAtualizando o topo:");
        pilha.atualizar("Terceiro Atualizado");
        System.out.println("Topo após atualização: " + pilha.topo());

        System.out.println("\nDesempilhando:");
        System.out.println("Desempilhado: " + pilha.desempilhar());
        System.out.println("Estado atual: " + pilha.imprimir());

        System.out.println("\nEmpilhando mais elementos:");
        pilha.empilhar("Quarto");
        pilha.empilhar("Quinto");

        System.out.println("Estado final: " + pilha.imprimir());
        System.out.println("Pilha cheia? " + pilha.estaCheia());
    }
}
