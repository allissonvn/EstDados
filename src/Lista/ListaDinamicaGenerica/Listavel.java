package Lista.ListaDinamicaGenerica;
    /**
     * Interface que define as operações básicas da lista
     * a interface define os metodos que devem ser implementados
     * por qualquer classe que represente uma estrutura de dados do tipo lista
     *
     *
     * @param <T> o tipo dos elementos armazenados na lista
     * @author Allisson de Almeida Bento Viana
     * @version 1.0
     * @since 15-06-2025
     * */

public interface Listavel<T> {

    /**
     * Adiciona um elemento no final lista
     *
     * @param dado o elemento que vai ser adicionado
     * @throws OverflowException se a lista estiver cheia*/
    void anexar(T dado);

    /**
     * Adiciona um elemento em uma posição específica na lista
     *
     * @param dado o elemento que vai ser adicionado
     * @param posicao a posição em que o dado vai ser adicionado
     * @throws OverflowException se a lista estiver cheia
     * @throws IndexOutOfBoundsException se a posição for inválida*/
    void inserir(int posicao, T dado);

    /**
     * Retorna um elemento de uma posição específica na lista
     *
     * @param posicao a posição do elemento que vai ser retornado
     * @return o elemento da posição específica
     * @throws UnderflowException se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição for inválida*/
    T selecionar(int posicao);

    /**
     * Retorna todos os elementos da lista
     *
     * @return array com todos os elementos que estão na lista
     * @throws UnderflowException se a lista estiver vazia*/
    T[] selecionarTodos();

    /**
     * Atualiza o elemento em uma posição específica na lista
     *
     * @param posicao a posição onde o elemento vai ser atualizado
     * @param novoDado o novo elemento
     * @throws UnderflowException se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição estiver inválida*/
    void atualizar(int posicao, T novoDado);

    /**
     * Remove o elemento em uma posição específica na lista
     *
     * @param posicao posicao a posição onde o elemento vai ser removido
     * @return retorna o elemento que foi removido
     * @throws UnderflowException se a lista estiver vazia
     * @throws IndexOutOfBoundsException se posição estiver inválida*/
    T apagar(int posicao);

    boolean estaCheia();

    boolean estaVazia();

    String imprimir();

}
