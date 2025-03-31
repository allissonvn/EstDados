package PilhaEstatica;

public class PilhaEstaticaPrincipal {
    public static void main(String[] args) {
        Empilhavel pilha = new PilhaEstatica(7);

        pilha.empilhar("Instituto");
        pilha.empilhar("Federal");
        System.out.println("Topo: " + pilha.topo());

        pilha.empilhar("de");
        pilha.empilhar("Educação");
        pilha.empilhar("Ciência");
        pilha.empilhar("e");
        System.out.println("Topo: " + pilha.topo());

        Object conteudo = pilha.desempilhar();
        pilha.desempilhar();

        pilha.empilhar("Tecnologia");
        pilha.empilhar("da");
        pilha.empilhar("Bahia");

        pilha.atualizar("São Paulo");

        pilha.empilhar(pilha.desempilhar());
        pilha.empilhar(conteudo);

        System.out.println("Pilha: " + pilha.imprimir());
    }
}
