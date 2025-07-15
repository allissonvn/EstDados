package Fila.FilaDinamicaGenerica;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FilaDinamicaDuplaTerminacaoGenericaMain {
    public static void main(String[] args) {
        Enfileiravel<String> fila = new FilaDinamicaDuplaTerminacaoGenerica<>(7);
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção (0-12): ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir o newline

                switch (opcao) {
                    case 0:
                        System.out.println("Saindo da Fila. Até mais!");
                        break;
                    case 1:
                        enfileirarInicio(fila, scanner);
                        break;
                    case 2:
                        enfileirarFim(fila, scanner);
                        break;
                    case 3:
                        desenfileirarInicio(fila);
                        break;
                    case 4:
                        desenfileirarFim(fila);
                        break;
                    case 5:
                        mostrarFrente(fila);
                        break;
                    case 6:
                        mostrarTras(fila);
                        break;
                    case 7:
                        atualizarInicio(fila, scanner);
                        break;
                    case 8:
                        atualizarFim(fila, scanner);
                        break;
                    case 9:
                        System.out.println("Fila (Frente->Trás): " + fila.imprimirDeFrentePraTras());
                        break;
                    case 10:
                        System.out.println("Fila (Trás->Frente): " + fila.imprimirDeTrasPraFrente());
                        break;
                    case 11:
                        System.out.println("Tamanho da fila: " + fila.tamanho());
                        break;
                    case 12:
                        limparFila(fila);
                        break;
                    case 13:
                        verificarElemento(fila, scanner);
                        break;
                    case 14:
                        obterElemento(fila, scanner);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.nextLine();
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== FILA DUPLA DINÂMICA GENÉRICA CLI ===");
        System.out.println("0. SAIR");
        System.out.println("1. Enfileirar no Inicio");
        System.out.println("2. Enfileirar no Fim");
        System.out.println("3. Desenfileirar do Inicio");
        System.out.println("4. Desenfileirar do Fim");
        System.out.println("5. Frente da Fila");
        System.out.println("6. Fundo da Fila");
        System.out.println("7. Atualizar no Inicio");
        System.out.println("8. Atualizar no Fim");
        System.out.println("9. Imprimir de Frente para Tras");
        System.out.println("10. Imprimir de Tras para Frente");
        System.out.println("11. Tamanho da Fila");
        System.out.println("12. Limpar Fila");
        System.out.println("13. Verificar Elemento");
        System.out.println("14. Obter Elemento por Índice");
    }

    private static void enfileirarInicio(Enfileiravel<String> fila, Scanner scanner) {
        System.out.print("Digite o valor: ");
        String valor = scanner.nextLine();
        try {
            fila.enfileirarInicio(valor);
            System.out.println("Valor adicionado no início.");
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void enfileirarFim(Enfileiravel<String> fila, Scanner scanner) {
        System.out.print("Digite o valor: ");
        String valor = scanner.nextLine();
        try {
            fila.enfileirarFim(valor);
            System.out.println("Valor adicionado no fim.");
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void desenfileirarInicio(Enfileiravel<String> fila) {
        try {
            String valor = fila.desenfileirarInicio();
            System.out.println("Valor removido do início: " + valor);
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void desenfileirarFim(Enfileiravel<String> fila) {
        try {
            String valor = fila.desenfileirarFim();
            System.out.println("Valor removido do fim: " + valor);
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void mostrarFrente(Enfileiravel<String> fila) {
        try {
            System.out.println("Frente: " + fila.frente());
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void mostrarTras(Enfileiravel<String> fila) {
        try {
            System.out.println("Fundo: " + fila.tras());
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void atualizarInicio(Enfileiravel<String> fila, Scanner scanner) {
        System.out.print("Digite o novo valor: ");
        String valor = scanner.nextLine();
        try {
            fila.atualizarInicio(valor);
            System.out.println("Início atualizado.");
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void atualizarFim(Enfileiravel<String> fila, Scanner scanner) {
        System.out.print("Digite o novo valor: ");
        String valor = scanner.nextLine();
        try {
            fila.atualizarFim(valor);
            System.out.println("Fim atualizado.");
        } catch (NoSuchElementException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    private static void limparFila(Enfileiravel<String> fila) {
        fila.limpar();
        System.out.println("Fila limpa.");
    }

    private static void verificarElemento(Enfileiravel<String> fila, Scanner scanner) {
        System.out.print("Digite o valor a verificar: ");
        String valor = scanner.nextLine();
        boolean contem = fila.contem(valor);
        System.out.println("A fila " + (contem ? "contém" : "não contém") + " o valor '" + valor + "'");
    }

    private static void obterElemento(Enfileiravel<String> fila, Scanner scanner) {
        System.out.print("Digite o índice (0-" + (fila.tamanho() - 1) + "): ");
        try {
            int indice = scanner.nextInt();
            scanner.nextLine();
            String valor = fila.obter(indice);
            System.out.println("Elemento no índice " + indice + ": " + valor);
        } catch (InputMismatchException e) {
            System.err.println("Erro: Índice deve ser um número inteiro.");
            scanner.nextLine();
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}