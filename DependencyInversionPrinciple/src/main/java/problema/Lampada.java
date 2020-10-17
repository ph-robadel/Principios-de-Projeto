package problema;

class Lampada {
    private boolean estado;
    
    public void ligar(){
        this.estado = true;
    }
    
    public void desligar(){
        this.estado = false;
    }

    public boolean isLigado() {
        return estado;
    }
    
}
