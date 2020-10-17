package solucao;

public class PilhaInt implements IPilha {

    private int tamanho;
    private int vetor[];
    private int quantidadeElementos;

    public PilhaInt(int tamanho) {
        this.tamanho = tamanho;
        vetor = new int[tamanho];
        quantidadeElementos = 0;
    }

    @Override
    public void empilhar(int numero) {
        if (isCheia()) {
            throw new RuntimeException("Pinha está cheia! Não é possível inserir nenhum elemento");
        }

        vetor[quantidadeElementos] = numero;
        quantidadeElementos++;
    }

    @Override
    public int desempilhar() {
        if (isVazia()) {
            throw new RuntimeException("Pilha está vazia! Não é possível remover nenhum elemento");
        }

        return vetor[quantidadeElementos--];

    }

    @Override
    public int quantidadeElementos() {
        return this.quantidadeElementos;
    }

    @Override
    public boolean isVazia() {
        return quantidadeElementos == 0;
    }

    @Override
    public boolean isCheia() {
        return quantidadeElementos == tamanho;
    }

    @Override
    public void imprimirEstrutura() {
        if (isVazia()) {
            throw new RuntimeException("Pilha vazia!");
        }

        for (int i = 0; i < quantidadeElementos; i++) {
            System.out.print("[" + vetor[i] + "]");
        }
        System.out.println();
    }

    public int[] getVetor() {
        return vetor;
    }

}
