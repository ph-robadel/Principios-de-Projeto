package problema;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Entregador("Pedro", "Motoboy", 1000, 1.75));
        funcionarios.add(new Gerente("Henrique", "Gerente de Projetos", 5700, 480));
        funcionarios.add(new Gerente("Robadel", "Gerente de vendas", 5700, 730));
        
        for(Funcionario f : funcionarios){
            if(f instanceof Gerente){
                f.calcularSalarioTotal();
            }else if(f instanceof Entregador){
                f.calcularSalarioTotal(70);
            }
            System.out.println(f);
        }
    }
}
