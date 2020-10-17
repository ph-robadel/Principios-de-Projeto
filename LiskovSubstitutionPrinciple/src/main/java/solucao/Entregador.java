package solucao;

class Entregador extends Funcionario{
    private double comissao;
    private int quantidadeEntrega;

    public Entregador(String nome, String cargo, double salarioBase, double comissao, int quantidadeEntrega) {
        super.setNome(nome);
        super.setCargo(cargo);
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }
    
    @Override
    public void calcularSalarioTotal() {
        salarioTotal = getSalarioBase() + (comissao * quantidadeEntrega);
    }


    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
    @Override
    public String toString() {
        return "Entregador: "+super.toString()+ ", comissão=" + comissao;
    }
    
    
}