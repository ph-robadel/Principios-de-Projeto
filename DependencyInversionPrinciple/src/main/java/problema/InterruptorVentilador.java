package problema;

public class InterruptorVentilador {
    private Ventilador ventilador;

    public InterruptorVentilador() {
        ventilador = new Ventilador();
    }
    
    public void acionar(){
        if(ventilador.isLigado())
            ventilador.desligar();
        else
            ventilador.ligar();
    }
    
    public String getEstado(){
        if(ventilador.isLigado())
            return "Ventilador ligado";
        else
            return "Ventilador desligado";
    }
}
