package solucao;

public class PagarPedido {
    
    public void realizarPagamento(Pedido pedido, FormaPagamento formaPagamento){
        if(pedido == null)
            throw new RuntimeException("O Pedido não é válido!");
        
        formaPagamento.pagar(pedido.getValor());
        pedido.setStatus("PAGO");
    }
}
