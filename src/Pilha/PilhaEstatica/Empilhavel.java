<<<<<<< HEAD
package Pilha.PilhaEstatica;
=======
package PilhaEstatica;
>>>>>>> 1382df7bf03ba059263c1b5256454c00f7219d0f
public interface Empilhavel {
    void empilhar(Object elemento);
    Object desempilhar();
    Object topo();
    void atualizar(Object elemento);

    boolean estaVazia();
    boolean estaCheia();
    String imprimir();
}
