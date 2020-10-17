package problema;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido(250);
        Pedido pedido2 = new Pedido(127.50);
        PagarPedido pagarPedido = new PagarPedido();
        
        pagarPedido.realizarPagamento(pedido1, pagarPedido.DINHEIRO);
        pagarPedido.realizarPagamento(pedido2, pagarPedido.CARTAODECREDITO);
    }
}
