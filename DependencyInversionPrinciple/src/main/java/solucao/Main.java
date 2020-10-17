package solucao;

public class Main {
    public static void main(String[] args) {
        IDispositivo lampada = new Lampada();
        IDispositivo ventilador = new Ventilador();
        
        Interruptor iLampada = new Interruptor(lampada);
        Interruptor iVentilador = new Interruptor(ventilador);
        
        System.out.println(iLampada.getEstado());
        iLampada.acionar();
        System.out.println(iLampada.getEstado());
        
        System.out.println(iVentilador.getEstado());
        iVentilador.acionar();
        System.out.println(iVentilador.getEstado());
    }
}
