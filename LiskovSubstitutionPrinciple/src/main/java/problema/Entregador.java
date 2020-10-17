package problema;

class Entregador extends Funcionario{
    private double comissao;

    public Entregador(String nome, String cargo, double salarioBase, double comissao) {
        super.setNome(nome);
        super.setCargo(cargo);
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }
    
    @Override
    public void calcularSalarioTotal(int quantidadeEntrega) {
        salarioTotal = getSalarioBase() + (comissao * quantidadeEntrega);
    }

    @Override
    public void calcularSalarioTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
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