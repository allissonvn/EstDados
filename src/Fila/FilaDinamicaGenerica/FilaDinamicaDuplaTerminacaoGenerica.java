package Fila.FilaDinamicaGenerica;
import java.util.NoSuchElementException;

/**
 * Implementação de uma fila dinâmica dupla terminação genérica.
 * Esta classe implementa uma fila que pode armazenar elementos de qualquer tipo,
 * permitindo operações tanto no início quanto no final da fila.
 *
 * @param <T> o tipo dos elementos armazenados na fila
 * @author Allisson de Almeida Viana
 * @version 1.1
 */
public class FilaDinamicaDuplaTerminacaoGenerica<T> implements Enfileiravel<T> {

    private int quantidade;
    private int capacidade;
    private NoDuplo<T> ponteiroInicio;
    private NoDuplo<T> ponteiroFim;

    public FilaDinamicaDuplaTerminacaoGenerica() {
        this(10);
    }

    public FilaDinamicaDuplaTerminacaoGenerica(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser maior que zero");
        }
        this.capacidade = capacidade;
        this.quantidade = 0;
        this.ponteiroInicio = null;
        this.ponteiroFim = null;
    }

    @Override
    public void enfileirarInicio(T dado) {
        if (estaCheia()) {
            throw new IllegalStateException("Fila Cheia!");
        }

        NoDuplo<T> novoNo = new NoDuplo<>(dado);

        if (estaVazia()) {
            ponteiroFim = novoNo;
        } else {
            novoNo.setProximo(ponteiroInicio);
            ponteiroInicio.setAnterior(novoNo);
        }

        ponteiroInicio = novoNo;
        quantidade++;
    }

    @Override
    public void enfileirarFim(T dado) {
        if (estaCheia()) {
            throw new IllegalStateException("Fila Cheia!");
        }

        NoDuplo<T> novoNo = new NoDuplo<>(dado);

        if (estaVazia()) {
            ponteiroInicio = novoNo;
        } else {
            novoNo.setAnterior(ponteiroFim);
            ponteiroFim.setProximo(novoNo);
        }

        ponteiroFim = novoNo;
        quantidade++;
    }

    @Override
    public T desenfileirarInicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila Vazia!");
        }

        T dado = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();

        if (ponteiroInicio != null) {
            ponteiroInicio.setAnterior(null);
        } else {
            ponteiroFim = null;
        }

        quantidade--;
        return dado;
    }

    @Override
    public T desenfileirarFim() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila Vazia!");
        }

        T dado = ponteiroFim.getDado();
        ponteiroFim = ponteiroFim.getAnterior();

        if (ponteiroFim != null) {
            ponteiroFim.setProximo(null);
        } else {
            ponteiroInicio = null;
        }

        quantidade--;
        return dado;
    }

    @Override
    public T frente() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        return ponteiroInicio.getDado();
    }

    @Override
    public T tras() {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        return ponteiroFim.getDado();
    }

    @Override
    public void atualizarInicio(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        ponteiroInicio.setDado(dado);
    }

    @Override
    public void atualizarFim(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("Fila Vazia!");
        }
        ponteiroFim.setDado(dado);
    }

    @Override
    public boolean estaCheia() {
        return quantidade == capacidade;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    @Override
    public String imprimirDeFrentePraTras() {
        StringBuilder sb = new StringBuilder("[");
        NoDuplo<T> atual = ponteiroInicio;

        while (atual != null) {
            sb.append(atual.getDado());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public String imprimirDeTrasPraFrente() {
        StringBuilder sb = new StringBuilder("[");
        NoDuplo<T> atual = ponteiroFim;

        while (atual != null) {
            sb.append(atual.getDado());
            if (atual.getAnterior() != null) {
                sb.append(", ");
            }
            atual = atual.getAnterior();
        }

        sb.append("]");
        return sb.toString();
    }

    @Override
    public int tamanho() {
        return quantidade;
    }

    @Override
    public int capacidade() {
        return capacidade;
    }

    @Override
    public void limpar() {
        ponteiroInicio = null;
        ponteiroFim = null;
        quantidade = 0;
    }

    @Override
    public boolean contem(T dado) {
        if (dado == null) {
            throw new IllegalArgumentException("Dado não pode ser nulo");
        }

        NoDuplo<T> atual = ponteiroInicio;
        while (atual != null) {
            if (dado.equals(atual.getDado())) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    @Override
    public T obter(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        NoDuplo<T> atual;
        if (indice < quantidade / 2) {
            // Percorre do início se o índice estiver na primeira metade
            atual = ponteiroInicio;
            for (int i = 0; i < indice; i++) {
                atual = atual.getProximo();
            }
        } else {
            // Percorre do fim se o índice estiver na segunda metade
            atual = ponteiroFim;
            for (int i = quantidade - 1; i > indice; i--) {
                atual = atual.getAnterior();
            }
        }

        return atual.getDado();
    }
}