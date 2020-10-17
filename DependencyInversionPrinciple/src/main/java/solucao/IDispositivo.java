package solucao;

public interface IDispositivo {
    
    public void ligar();
    
    public void desligar();

    public boolean isLigado();
    
    public String getEstado();
}
