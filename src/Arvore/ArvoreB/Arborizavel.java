package Arvore.ArvoreB;

public interface Arborizavel<T extends Comparable<T>> {

    void inserir(T dado);


    T apagar(T dado);


    boolean existe(T dado);


    void limpar();


    String imprimirPreOrdem();


    String imprimirEmOrdem();


    String imprimirPosOrdem();


    NoArvoreB<T> getRaiz();
}
