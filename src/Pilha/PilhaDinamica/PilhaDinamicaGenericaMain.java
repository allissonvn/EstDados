package Pilha.PilhaDinamica;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class PilhaDinamicaGenericaMain {
    public static void main(String[] args) {
        Empilhavel<String> pilha = new PilhaDinamicaGenerica<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();

            System.out.println("Escolha uma opção 1-5:");
            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao){
                    case 0:
                        System.out.println("Saindo da pilha");
                        break;
                    case 1:
                        System.out.println("Digite um valor:");
                        String valor = sc.nextLine();
                            try {
                                pilha.empilhar(valor);
                            }catch (NoSuchElementException e){
                                System.err.println(e.getMessage());
                            }
                        break;
                    case 2:
                        System.out.println("Desejar desempilhar? [s/n]");
                        String validar = sc.nextLine().trim().toLowerCase();
                        if (validar.equals("s")){
                            try {
                                pilha.desempilhar();
                            }catch (NoSuchElementException e){
                                System.err.println(e.getMessage());
                            }
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Topo: "+ pilha.espiar());
                        }catch (NoSuchElementException e){
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 4:
                        System.out.println("Informa o valor que atualizado:");
                        String novoValor = sc.nextLine();
                        try {
                             pilha.atualizar(novoValor);
                        }catch (NoSuchElementException e){
                            System.err.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println(pilha.imprimir());
                        break;
                    default:
                        System.out.println("Opção Inválido");
                }
            } catch (NoSuchElementException e){
                System.out.println("Entrada inválida. Tente novamente.");
                sc.nextLine(); // Consumir a entrada inválida
                opcao = -1;
            }

        }while (opcao != 0);

        sc.close();
    }

    public static void exibirMenu(){
        System.out.println("=== PILHA DINÂMICA GENÉRICA ===");
        System.out.println("0. SAIR");
        System.out.println("1. Empilhar");
        System.out.println("2. Desempilhar");
        System.out.println("3. Espiar");
        System.out.println("4. Atualizar");
        System.out.println("5. Imprimir");
    }
}
