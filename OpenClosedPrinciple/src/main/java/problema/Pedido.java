package problema;

public class Pedido {
    private double valor;
    private String status;

    public Pedido(double valor) {
        this.valor = valor;
        this.status = "ABERTO";
    }

    public double getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(status.equalsIgnoreCase("PAGO") || status.equalsIgnoreCase("CANCELADO")){
            this.status = status.toUpperCase();
        }else{
            throw new RuntimeException("O status informado não é válido");
        }
    }
    
    
    
    
}
