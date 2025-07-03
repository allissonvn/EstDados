package Pilha.PilhaDinamica;

import java.util.NoSuchElementException;

public class PilhaDinamicaGenerica<T> implements Empilhavel<T> {

    private int quantidade;

    private int tamanho;

    NoDuplo<T> ponteiroTopo;

    /**
     * Adiciona um elemento ao topo da pilha.
     *
     * @param dado o elemento a ser adicionado
     * @throws NoSuchElementException se a pilha estiver cheia
     */
    @Override
    public void empilhar(T dado) {
        if (estaCheia()){
            throw new NoSuchElementException("Pilha está Cheia");
        }
        NoDuplo<T> NovoNo = new NoDuplo<>();
        NovoNo.setDado(dado);
        NovoNo.setAnterior(ponteiroTopo);
        if (!estaVazia()){
            ponteiroTopo.setProximo(NovoNo);
        }
        ponteiroTopo = NovoNo;
        quantidade++;

    }

    /**
     * Remove e retorna o elemento do topo da pilha.
     *
     * @return o elemento removido do topo
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    @Override
    public T desempilhar() {
        if (estaVazia()){
            throw new NoSuchElementException("Pilha Vazia");
        }
        T dadoTopo = ponteiroTopo.getDado();
        ponteiroTopo = ponteiroTopo.getAnterior();
        quantidade--;
        if (!estaVazia()){
            ponteiroTopo.setProximo(null);
        }
        return dadoTopo;
    }

    /**
     * Retorna o elemento do topo da pilha sem removê-lo.
     *
     * @return o elemento do topo
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    @Override
    public T espiar() {
        if (estaVazia()){
            throw new NoSuchElementException("Pilha Vazia");
        }
        return ponteiroTopo.getDado();
    }

    /**
     * Retorna um array contendo todos os elementos da pilha.
     * O elemento do topo será o último elemento do array.
     *
     * @param dado o elemento substituirá o elemento do topo
     * @throws NoSuchElementException se a pilha estiver vazia
     */
    @Override
    public void atualizar(T novoDado) {
        if (estaVazia()){
            throw new NoSuchElementException("Pilha Vazia");
        }
        ponteiroTopo.setDado(novoDado);

    }

    /**
     * Verifica se a pilha está cheia.
     *
     * @return true se a pilha estiver cheia, false caso contrário
     */
    @Override
    public boolean estaCheia() {
        return (quantidade == tamanho);
    }

    /**
     * Verifica se a pilha está vazia.
     *
     * @return true se a pilha estiver vazia, false caso contrário
     */
    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    /**
     * Retorna uma representação em string da pilha.
     * Os elementos são separados por vírgula e delimitados por colchetes.
     * O elemento do topo será o último elemento na string.
     *
     * @return string representando a pilha
     */
    @Override
    public String imprimir() {
        String resultado = "[";
        NoDuplo<T> ponteirooAuxiliar = new NoDuplo<>();
        ponteirooAuxiliar = ponteiroTopo;
        for (int i = 0; i < quantidade; i++) {
            resultado += ponteirooAuxiliar.getDado();
            if (i > quantidade -1){
                resultado = ",";
            }
            ponteirooAuxiliar = ponteiroTopo.getAnterior();
        }
        return resultado += "]";
    }

}
