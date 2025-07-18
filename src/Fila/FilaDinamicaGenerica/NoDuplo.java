package Fila.FilaDinamicaGenerica;

/**
 * Classe que representa um nó duplamente encadeado.
 * Esta classe é utilizada para implementar estruturas de dados
 * que necessitam de nós com referências para o próximo e anterior.
 *
 * @param <T> o tipo do dado armazenado no nó
 * @author Allisson de Almeida Viana
 * @version 1.1
 */
public class NoDuplo<T> {

    /** O dado armazenado no nó */
    private T dado;

    /** Referência para o nó anterior */
    private NoDuplo<T> anterior;

    /** Referência para o próximo nó */
    private NoDuplo<T> proximo;

    /**
     * Construtor padrão que cria um nó com todos os atributos nulos.
     */
    public NoDuplo() {
        this(null);
    }

    /**
     * Construtor que cria um nó com o dado especificado.
     *
     * @param dado o dado a ser armazenado no nó
     */
    public NoDuplo(T dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    /**
     * Retorna o dado armazenado no nó.
     *
     * @return o dado do nó
     */
    public T getDado() {
        return dado;
    }

    /**
     * Define o dado a ser armazenado no nó.
     *
     * @param dado o novo dado (pode ser nulo)
     */
    public void setDado(T dado) {
        this.dado = dado;
    }

    /**
     * Retorna a referência para o nó anterior.
     *
     * @return o nó anterior ou null se não existir
     */
    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    /**
     * Define a referência para o nó anterior.
     *
     * @param anterior o novo nó anterior (pode ser nulo)
     */
    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * Retorna a referência para o próximo nó.
     *
     * @return o próximo nó ou null se não existir
     */
    public NoDuplo<T> getProximo() {
        return proximo;
    }

    /**
     * Define a referência para o próximo nó.
     *
     * @param proximo o novo próximo nó (pode ser nulo)
     */
    public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    /**
     * Retorna uma representação em string do nó.
     *
     * @return string representando o nó
     */
    @Override
    public String toString() {
        return "NoDuplo{" + "dado=" + dado + '}';
    }
}