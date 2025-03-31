package PilhaEstatica;
public interface Empilhavel {
    void empilhar(Object elemento);
    Object desempilhar();
    Object topo();
    void atualizar(Object elemento);

    boolean estaVazia();
    boolean estaCheia();
    String imprimir();
}
