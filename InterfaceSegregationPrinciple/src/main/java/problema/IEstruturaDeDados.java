package problema;

public interface IEstruturaDeDados {

    public void empilhar(int numero);

    public int desempilhar();

    public void enfileirar(int numero);

    public int desenfileirar();

    public int quantidadeElementos();

    public boolean isVazia();

    public boolean isCheia();

    public void imprimirEstrutura();
}
