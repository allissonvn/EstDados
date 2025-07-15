package Fila.FilaDinamicaGenerica;
import java.util.NoSuchElementException;

/**
 * Interface que define as operações básicas de uma fila genérica.
 * Esta interface define os métodos que devem ser implementados
 * por qualquer classe que represente uma estrutura de dados do tipo fila.
 *
 * @param <T> o tipo dos elementos armazenados na fila
 * @author Allisson de Almeida Viana
 * @version 1.1
 */
public interface Enfileiravel<T> {

    /**
     * Adiciona um elemento ao início da fila.
     *
     * @param dado o elemento a ser adicionado
     * @throws java.util.NoSuchElementException se a fila estiver cheia
     */
    void enfileirarInicio(T dado);

    /**
     * Adiciona um elemento ao final da fila.
     *
     * @param dado o elemento a ser adicionado
     * @throws java.util.NoSuchElementException se a fila estiver cheia
     */
    void enfileirarFim(T dado);

    /**
     * Retorna o elemento do início da fila sem removê-lo.
     *
     * @return o elemento do início
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    T frente();

    /**
     * Retorna o elemento do final da fila sem removê-lo.
     *
     * @return o elemento do final
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    T tras();

    /**
     * Atualiza o elemento do início da fila.
     *
     * @param dado o novo elemento
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    void atualizarInicio(T dado);

    /**
     * Atualiza o elemento do final da fila.
     *
     * @param dado o novo elemento
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    void atualizarFim(T dado);

    /**
     * Remove e retorna o elemento do início da fila.
     *
     * @return o elemento removido do início
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    T desenfileirarInicio();

    /**
     * Remove e retorna o elemento do final da fila.
     *
     * @return o elemento removido do final
     * @throws java.util.NoSuchElementException se a fila estiver vazia
     */
    T desenfileirarFim();

    /**
     * Verifica se a fila está cheia.
     *
     * @return true se a fila estiver cheia, false caso contrário
     */
    boolean estaCheia();

    /**
     * Verifica se a fila está vazia.
     *
     * @return true se a fila estiver vazia, false caso contrário
     */
    boolean estaVazia();

    /**
     * Retorna uma representação em string da fila do final para o início.
     * Os elementos são separados por vírgula e delimitados por colchetes.
     *
     * @return string representando a fila do final para o início
     */
    String imprimirDeTrasPraFrente();

    /**
     * Retorna uma representação em string da fila do início para o final.
     * Os elementos são separados por vírgula e delimitados por colchetes.
     *
     * @return string representando a fila do início para o final
     */
    String imprimirDeFrentePraTras();

    // Novos métodos adicionados na versão 1.1
    /**
     * Retorna a quantidade de elementos na fila.
     *
     * @return número de elementos na fila
     */
    int tamanho();

    /**
     * Remove todos os elementos da fila.
     */
    void limpar();

    /**
     * Verifica se um elemento específico está na fila.
     *
     * @param dado o elemento a ser verificado
     * @return true se o elemento estiver na fila, false caso contrário
     */
    boolean contem(T dado);

    /**
     * Retorna o elemento em uma posição específica da fila.
     *
     * @param indice a posição do elemento (0-based)
     * @return o elemento na posição especificada
     * @throws IndexOutOfBoundsException se o índice for inválido
     */
    T obter(int indice);
}