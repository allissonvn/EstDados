package Pilha.PilhaInvertida;

public class PilhaInvertida implements Empilhavel {
    private int base;
    private final Object[] elementos;
    private final int capacidade;

    public PilhaInvertida(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.base = capacidade; // Começa após o último índice
    }

    public PilhaInvertida() {
        this(10);
    }

    @Override
    public void empilhar(Object elemento) {
        if (estaCheia()) {
            throw new IllegalStateException("Pilha cheia");
        }
        elementos[--base] = elemento;
    }

    @Override
    public Object desempilhar() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        Object elemento = elementos[base];
        elementos[base] = null; // Limpa a referência
        base++;
        return elemento;
    }

    @Override
    public Object topo() {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        return elementos[base];
    }

    @Override
    public void atualizar(Object elemento) {
        if (estaVazia()) {
            throw new IllegalStateException("Pilha vazia");
        }
        elementos[base] = elemento;
    }

    @Override
    public boolean estaVazia() {
        return base == capacidade;
    }

    @Override
    public boolean estaCheia() {
        return base == 0;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = base; i < capacidade; i++) {
            sb.append(elementos[i]);
            if (i < capacidade - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
