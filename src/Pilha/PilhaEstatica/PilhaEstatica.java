package PilhaEstatica;

public class PilhaEstatica implements Empilhavel {
    private int topo;
    private final Object[] elementos;
    private final int capacidade;

    public PilhaEstatica(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.topo = -1;
    }

    public PilhaEstatica() {
        this(10);
    }

    @Override
    public void empilhar(Object elemento) {
        if (estaCheia()) {
            throw new IllegalStateException("Pilha cheia");
        }
        elementos[++topo] = elemento;
    }

    @Override
    public Object desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return elementos[topo--];
    }

    @Override
    public Object topo() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return elementos[topo];
    }

    @Override
    public void atualizar(Object elemento) {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        elementos[topo] = elemento;
    }

    @Override
    public boolean estaVazia() {
        return topo == -1;
    }

    @Override
    public boolean estaCheia() {
        return topo == capacidade - 1;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = topo; i >= 0; i--) {
            sb.append(elementos[i]);
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
