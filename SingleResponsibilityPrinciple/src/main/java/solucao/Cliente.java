package solucao;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, LocalDate dataNascimento, String cpf, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "Cliente:" + nome + "\n";
        texto += "Data de Nascimento: " + dataNascimento + "\n";
        texto += "CPF: " + cpf + "\n";
        texto += "Endereço: \n";
        texto += endereco;
        
        return texto;
    }
    
    
}
