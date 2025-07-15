package Ordencao.Bubblesort;
import java.util.Random;
public class BubblesortDinamicoPrincipal {
    public static void main(String[] args){
        Random gerador = new Random();
        int tamanho = 10;
        BubblesortDinamico sort = new BubblesortDinamico();

        // Preenchendo o vetor com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            Integer numero = gerador.nextInt(120) + 10;
            sort.anexar(numero);
        }

        System.out.println(sort.imprimir());
        sort.ordenar();
        System.out.println(sort.imprimir());
    }

}
