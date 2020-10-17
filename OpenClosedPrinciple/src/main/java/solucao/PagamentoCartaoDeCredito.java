package solucao;

public class PagamentoCartaoDeCredito implements FormaPagamento{

    @Override
    public void pagar(double valor) {
        System.out.println("R$"+valor+" pago no cartão de crédito");
    }
    
}
