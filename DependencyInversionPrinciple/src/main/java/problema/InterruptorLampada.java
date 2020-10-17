package problema;

public class InterruptorLampada {
    private Lampada lampada;

    public InterruptorLampada() {
        lampada = new Lampada();
    }
    
    public void acionar(){
        if(lampada.isLigado())
            lampada.desligar();
        else
            lampada.ligar();
    }
    
    public String getEstado(){
        if(lampada.isLigado())
            return "Lampada ligada";
        else
            return "Lampada desligada";
    }
}
