package solucao;

public class Lampada implements IDispositivo{
    private boolean estado;

    @Override
    public void ligar(){
        this.estado = true;
    }
    @Override
    public void desligar(){
        this.estado = false;
    }

    @Override
    public boolean isLigado() {
        return estado;
    }
    
    @Override
    public String getEstado() {
        if(estado)
            return "Lampada ligada";
        else
            return "Lampada desligada";
    }
    
    
}
