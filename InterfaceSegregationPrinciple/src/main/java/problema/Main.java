package problema;

public class Main {

    public static void main(String[] args) {
        IEstruturaDeDados pilha = new PilhaInt(5);
        pilha.empilhar(13);
        pilha.empilhar(7);
        pilha.empilhar(5);
        pilha.empilhar(3);
        pilha.imprimirEstrutura();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.imprimirEstrutura();

        IEstruturaDeDados fila = new FilaInt(5);
        fila.enfileirar(13);
        fila.enfileirar(7);
        fila.enfileirar(5);
        fila.enfileirar(3);
        fila.imprimirEstrutura();
        fila.desenfileirar();
        fila.desenfileirar();
        fila.imprimirEstrutura();
    }
}
