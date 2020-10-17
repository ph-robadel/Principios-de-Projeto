package solucao;

public class PagamentoDinheiro implements FormaPagamento{
    
    @Override
    public void pagar(double valor) {
        System.out.println("R$"+valor+" pago no dinheiro");
    }
    
}
