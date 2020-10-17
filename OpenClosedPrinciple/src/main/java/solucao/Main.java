package solucao;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(250);
        Pedido pedido2 = new Pedido(127.50);
        PagarPedido pagarPedido = new PagarPedido();
        PagamentoDinheiro dinheiro = new PagamentoDinheiro();
        PagamentoCartaoDeCredito cartaoDeCredito = new PagamentoCartaoDeCredito();
        
        pagarPedido.realizarPagamento(pedido1, cartaoDeCredito);
        pagarPedido.realizarPagamento(pedido2, dinheiro);
    }
}
