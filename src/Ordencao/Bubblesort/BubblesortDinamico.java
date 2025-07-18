package Ordencao.Bubblesort;

public class BubblesortDinamico implements Ordenavel {

    private NoDuplo ponteiroInicio;
    private NoDuplo ponteiroFim;
    private int quantidade;

    public BubblesortDinamico() {
        quantidade = 0;
    }

    public void anexar(Object dado) {
        NoDuplo noTemporario = new NoDuplo();
        noTemporario.setDado(dado);
        if (quantidade == 0) {
            ponteiroInicio = noTemporario;
        } else  {
            ponteiroFim.setProximo(noTemporario);
        }
        noTemporario.setAnterior(ponteiroFim);
        ponteiroFim = noTemporario;
        quantidade++;
    }


    @Override
    public void ordenar() {
        for (int i = 0; i < (quantidade-1); i++) {
            NoDuplo atual = ponteiroInicio;
            NoDuplo proximo = atual.getProximo();
            for (int j = 0; j < (quantidade-1)-i; j++) {
                if ((Integer) atual.getDado() > (Integer) proximo.getDado()) {
                    trocar(atual, proximo);

                } //if
                atual = atual.getProximo();
                proximo = atual.getProximo();
            } //for
        } //for
    }

    private void trocar(NoDuplo a, NoDuplo b) {
        Object aux = a.getDado();
        a.setDado(b.getDado());
        b.setDado(aux);
    }

    @Override
    public String imprimir() {
        String resultado = "[";
        NoDuplo ponteiroAuxiliar = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            if (i == quantidade-1) {
                resultado += ponteiroAuxiliar.getDado();
            } else {
                resultado += ponteiroAuxiliar.getDado() + ",";
            }
            ponteiroAuxiliar = ponteiroAuxiliar.getProximo();
        }
        return resultado + "]";
    }
}
