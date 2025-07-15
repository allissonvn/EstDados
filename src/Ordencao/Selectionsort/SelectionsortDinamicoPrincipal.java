package Ordencao.Selectionsort;

import java.util.Random;

public class SelectionsortDinamicoPrincipal {

    public static void main(String[] args){
        Random gerador = new Random();
        int tamanho = 12;
        SelectionsortDinamico sort = new SelectionsortDinamico();

        for (int i = 0; i < tamanho; i++) {
            Integer numero = gerador.nextInt(160) + 10;
            sort.anexar(numero);
        }


        System.out.println(sort.imprimir());
        sort.ordenar();
        System.out.println(sort.imprimir());
    }
}