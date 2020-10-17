package solucao;

abstract class Funcionario{
    private String nome;
    private String cargo;
    private double salarioBase;
    protected double salarioTotal;

    public double getSalarioTotal() {
        return salarioTotal;
    }

    abstract public void calcularSalarioTotal();
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", cargo=" + cargo + ", salarioBase=" + salarioBase + ", salarioTotal=" + salarioTotal;
    }
    
    
    
}