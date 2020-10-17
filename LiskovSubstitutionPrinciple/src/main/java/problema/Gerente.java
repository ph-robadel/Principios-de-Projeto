package problema;

public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, String cargo, double salarioBase, double bonus) {
        super.setNome(nome);
        super.setCargo(cargo);
        super.setSalarioBase(salarioBase);
        this.bonus = bonus;
    }
    
    @Override
    public void calcularSalarioTotal() {
        salarioTotal = getSalarioBase() + bonus;
    }

    @Override
    public void calcularSalarioTotal(int quantidadeEntrega) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Gerente: "+super.toString()+ ", bonus=" + bonus;
    }

    
    
    
}
