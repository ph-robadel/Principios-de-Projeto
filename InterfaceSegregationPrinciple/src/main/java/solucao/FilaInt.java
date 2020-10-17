package solucao;

public class FilaInt implements IFila {

    private int tamanho;
    private int inicioFila;
    private int vetor[];
    private int quantidadeElementos;

    public FilaInt(int tamanho) {
        this.tamanho = tamanho;
        vetor = new int[tamanho];
        quantidadeElementos = 0;
        inicioFila = 0;
    }

    @Override
    public void enfileirar(int numero) {
        if (isCheia()) {
            throw new RuntimeException("Fila está cheia! Não é possível inserir nenhum elemento");
        }

        int fim = (inicioFila + quantidadeElementos) % tamanho;
        vetor[fim] = numero;
        quantidadeElementos++;
    }

    @Override
    public int desenfileirar() {
        if (isVazia()) {
            throw new RuntimeException("Fila está vazia! Não é possível remover nenhum elemento");
        }

        int elementoInicio = vetor[inicioFila];
        inicioFila = (inicioFila + 1) % tamanho;
        quantidadeElementos--;
        return elementoInicio;
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
            throw new RuntimeException("Fila vazia!");
        }

        for (int i = 0; i < quantidadeElementos; i++) {
            int elementoAtual = vetor[(inicioFila + i) % tamanho];
            System.out.print("[" + elementoAtual + "]");
        }
        System.out.println();
    }

    public int[] getVetor() {
        return vetor;
    }

}
