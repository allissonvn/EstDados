package Lista.ListaDinamicaGenerica;

public class ListaDinamicaGenerica<T> implements Listavel<T> {

    private int tamanho;
    private int quantidade;

    NoDuplo<T> ponteiroInicio = new NoDuplo<>();

    NoDuplo<T> ponteiroFim = new NoDuplo<>();

    public ListaDinamicaGenerica() {
        this(10);
    }

    public ListaDinamicaGenerica(int tamanho) {
        quantidade = 0;
        ponteiroInicio = null;
        ponteiroFim = null;
        this.tamanho = tamanho;
    }

    /**
     * Adiciona um elemento no final lista
     *
     * @param dado o elemento que vai ser adicionado
     * @throws OverflowException se a lista estiver cheia
     */
    @Override
    public void anexar(T dado) {
        if (estaCheia()){
            throw new OverflowException("Lista Cheia");
        }
        NoDuplo<T> NoTemporario = new NoDuplo<>();
        NoTemporario.setDado(dado);
        if (!estaVazia()){
            ponteiroFim.setProximo(NoTemporario);
            NoTemporario.setAnterior(ponteiroFim);
        }else {
            ponteiroInicio = NoTemporario;
        }
        ponteiroFim = NoTemporario;
        quantidade++;

    }

    /**
     * Adiciona um elemento em uma posição específica na lista
     *
     * @param posicao a posição em que o dado vai ser adicionado
     * @param dado    o elemento que vai ser adicionado
     * @throws OverflowException         se a lista estiver cheia
     * @throws IndexOutOfBoundsException se a posição for inválida
     */
    @Override
    public void inserir(int posicao, T dado) {
        if (estaCheia()){
            throw new OverflowException("Lista Cheia");
        }
        if (posicao < 0 && posicao > quantidade){
            throw new IndexOutOfBoundsException();
        }
        NoDuplo<T> NoTemporario = new NoDuplo<>();
        NoTemporario.setDado(dado);

        NoDuplo<T> ponteiroAnterior = null;
        NoDuplo<T> ponteiroProximo = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            ponteiroAnterior = ponteiroProximo;
            ponteiroProximo = ponteiroProximo.getProximo();
        }
        if (ponteiroAnterior != null){
            ponteiroAnterior.setProximo(NoTemporario);
        }else {
            ponteiroInicio = NoTemporario;
        }

        if (ponteiroProximo != null){
            ponteiroProximo.setAnterior(NoTemporario);
        }else {
            ponteiroFim = NoTemporario;
        }
        NoTemporario.setAnterior(ponteiroAnterior);
        NoTemporario.setProximo(ponteiroProximo);
        quantidade++;

    }

    /**
     * Retorna um elemento de uma posição específica na lista
     *
     * @param posicao a posição do elemento que vai ser retornado
     * @return o elemento da posição específica
     * @throws UnderflowException        se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição for inválida
     */
    @Override
    public T selecionar(int posicao) {
        if (estaVazia()) {
            throw new UnderflowException("Lista Vazia");
        }
        if (posicao < 0 && posicao > quantidade) {
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
        NoDuplo<T> NoTemporario = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            NoTemporario = NoTemporario.getProximo();
        }
        return NoTemporario.getDado();
    }

    /**
     * Retorna todos os elementos da lista
     *
     * @return array com todos os elementos que estão na lista
     * @throws UnderflowException se a lista estiver vazia
     */
    @Override
    public T[] selecionarTodos() {
        return null;
    }

    /**
     * Atualiza o elemento em uma posição específica na lista
     *
     * @param posicao  a posição onde o elemento vai ser atualizado
     * @param novoDado o novo elemento
     * @throws UnderflowException        se a lista estiver vazia
     * @throws IndexOutOfBoundsException se a posição estiver inválida
     */
    @Override
    public void atualizar(int posicao, T novoDado) {
        if (estaVazia()) {
            throw new UnderflowException("Lista Vazia");
        }
        if (posicao < 0 && posicao > quantidade) {
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
        NoDuplo<T> NoTemporario = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            NoTemporario = NoTemporario.getProximo();
        }
        NoTemporario.setDado(novoDado);

    }

    /**
     * Remove o elemento em uma posição específica na lista
     *
     * @param posicao posicao a posição onde o elemento vai ser removido
     * @return retorna o elemento que foi removido
     * @throws UnderflowException        se a lista estiver vazia
     * @throws IndexOutOfBoundsException se posição estiver inválida
     */
    @Override
    public T apagar(int posicao) {
        if (estaVazia()){
            throw new UnderflowException("Lista Vazia");
        }
        if (posicao < 0 && posicao > quantidade){
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
        NoDuplo<T> ponteiroAux = ponteiroInicio;
        for (int i = 0; i < posicao; i++) {
            ponteiroAux = ponteiroAux.getProximo();
        }

        NoDuplo<T> ponteiroAnterior = ponteiroAux.getAnterior();
        NoDuplo<T> ponteiroProximo = ponteiroAux.getProximo();

        if (ponteiroAnterior != null){
            ponteiroAnterior.setProximo(ponteiroProximo);
        }else {
            ponteiroInicio = ponteiroInicio.getProximo();
        }
        if (ponteiroProximo != null){
            ponteiroProximo.setAnterior(ponteiroAnterior);
        }else {
            ponteiroFim = ponteiroFim.getAnterior();
        }
        quantidade --;
        return ponteiroAux.getDado();
    }

    @Override
    public boolean estaCheia() {
        return (quantidade == tamanho);
    }

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public String imprimir() {
        String resultado = "[";
        NoDuplo<T> NoTemporario = new NoDuplo<>();
        NoTemporario = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            resultado += NoTemporario.getDado();
            if (i > quantidade -1){
                resultado += ",";
            }
            NoTemporario = NoTemporario.getProximo();
        }

        return resultado += "]";

    }
}
