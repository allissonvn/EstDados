package Arvore;

import java.util.ArrayList;
import java.util.List;


public class NoArvoreB<T extends Comparable<T>> {

    private List<T> chaves;


    private List<NoArvoreB<T>> ponteirosFilhos;


    private boolean folha;
    private int ordem;

    public NoArvoreB(int ordem) {
        this.ordem = ordem;
        this.chaves = new ArrayList<>();
        this.ponteirosFilhos = new ArrayList<>();
        this.folha = true;
    }


    public List<T> getChaves() {
        return chaves;
    }


    public void setChaves(List<T> chaves) {
        this.chaves = chaves;
    }


    public List<NoArvoreB<T>> getFilhos() {
        return ponteirosFilhos;
    }

    public void setFilhos(List<NoArvoreB<T>> ponteirosFilhos) {
        this.ponteirosFilhos = ponteirosFilhos;
    }

    public boolean isFolha() {
        return folha;
    }

    public void setFolha(boolean folha) {
        this.folha = folha;
    }

    public int getOrdem() {
        return ordem;
    }

    public int getNumeroChaves() {
        return chaves.size();
    }

    public boolean isCheio() {
        return chaves.size() == 2 * ordem - 1;
    }

    public void adicionarChave(T chave) {
        chaves.add(chave);
        chaves.sort(null); // Ordena as chaves
    }

    public boolean removerChave(T chave) {
        return chaves.remove(chave);
    }


    public void adicionarFilho(NoArvoreB<T> filho) {
        ponteirosFilhos.add(filho);
    }

    public boolean removerFilho(NoArvoreB<T> filho) {
        return ponteirosFilhos.remove(filho);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < chaves.size(); i++) {
            sb.append(chaves.get(i));
            if (i < chaves.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
