package Lista.ListaDinamicaGenerica;

public class UnderflowException extends RuntimeException {
    public UnderflowException(String mensagem) {
        super(mensagem);
    }
}
