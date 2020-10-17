package problema;

public class Main {
    public static void main(String[] args) {
        InterruptorVentilador interruptorVentilador = new InterruptorVentilador();
        System.out.println(interruptorVentilador.getEstado());
        interruptorVentilador.acionar();
        System.out.println(interruptorVentilador.getEstado());
        
        InterruptorLampada interruptorLampada = new InterruptorLampada();
        System.out.println(interruptorLampada.getEstado());
        interruptorLampada.acionar();
        System.out.println(interruptorLampada.getEstado());
        
    }
}
