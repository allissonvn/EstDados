package Ordencao.Insertionsort;
import java.util.Random;

public class InsertionsortDinamicoPrincipal {

    public static void main(String[] args){
        Random gerador = new Random();
        int tamanho = 15;
        InsertionsortDinamico sort = new InsertionsortDinamico();


        for (int i = 0; i < tamanho; i++) {
            Integer numero = gerador.nextInt(130) + 10;
            sort.anexar(numero);
        }


        System.out.println(sort.imprimir());
        sort.ordenar();
        System.out.println(sort.imprimir());
    }
}
