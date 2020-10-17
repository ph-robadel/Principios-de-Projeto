package problema;

public class PagarPedido {
    public final int DINHEIRO = 0;
    public final int CARTAODECREDITO = 1;

    public void realizarPagamento(Pedido pedido, int tipo) {
        if(pedido == null)
            throw new RuntimeException("O Pedido não é válido!");
        
        if(tipo == DINHEIRO){
            pagarDinheiro(pedido.getValor());
        }else if(tipo == CARTAODECREDITO){
            pagarCartaoDeCredito(pedido.getValor());
        }else{
            throw new RuntimeException("O tipo de pagamento não é válido!");
        }
        
        pedido.setStatus("PAGO");
    }

    private void pagarDinheiro(double valor) {
        System.out.println("R$"+valor+" pago no dinheiro");
    }
    
    private void pagarCartaoDeCredito(double valor) {
        System.out.println("R$"+valor+" pago no cartão de crédito");
    }
    
}
