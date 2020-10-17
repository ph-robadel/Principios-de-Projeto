package solucao;

public class Ventilador implements IDispositivo{
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
            return "Ventilador ligado";
        else
            return "Ventilador desligado";
    }
    
    
}
