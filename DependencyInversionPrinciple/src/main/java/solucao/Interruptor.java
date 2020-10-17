package solucao;

public class Interruptor {
    private IDispositivo dispositivo;

    public Interruptor(IDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    public void acionar(){
        if(dispositivo.isLigado())
            dispositivo.desligar();
        else
            dispositivo.ligar();
    }
    
    public String getEstado(){
        return dispositivo.getEstado();
    }
}
