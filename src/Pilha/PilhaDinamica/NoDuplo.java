package Pilha.PilhaDinamica;
    /**
     * Essa classe representa um nó duplamente encadeado
     * Esta classe utilza a implementação de estrutura de dados
     * que necessitam de nós para referência de próximo e anterior
     *
     * @param <T> o tipo dos elementos armazenados na pilha
     * @author Allisson de Almeida Bento Viana
     * @version 1.0
     * @since 15-06-2025
     */
public class NoDuplo<T> {

    /**Este é o dado armazenado em cada nó*/
    private T dado;

    /**Este é a refência ao nó anterior*/
    private NoDuplo<T> anterior;

    /**Este é a refência ao nó próximo*/
    private NoDuplo<T> proximo;

    /**
     * Retorna o dado armazenado no nó
     *
     * @return o dado no nó
     */
    public T getDado() {
        return dado;
    }

    /**
     * Define o dado que sera armazenado no nó
     *
     * @param dado que vai ser armazenado no nó
     */
    public void setDado(T dado) {
        this.dado = dado;
    }

    /**
     * Retorna o dado armazenado refenciado no nó anterior
     *
     * @return o dado no nó anterior
     */
    public NoDuplo<T> getAnterior() {
        return anterior;
    }

    /**
     * Define o dado que sera armazenado no nó anterior
     *
     * @param anterior o dado que vai ser armazenado no nó anterior
     */

    public void setAnterior(NoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * Retorna o dado armazenado refenciado no nó proximo
     *
     * @return o dado no nó proximo
     */
    public NoDuplo<T> getProximo() {
        return proximo;
    }

    /**
     * Define o dado que sera armazenado no nó proximo
     *
     * @param proximo o dado que vai ser armazenado no nó proximo
     */
        public void setProximo(NoDuplo<T> proximo) {
        this.proximo = proximo;
    }
}
