package problema;

import java.time.LocalDate;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Cliente(String nome, LocalDate dataNascimento, String cpf, String rua, String numero, String bairro, String cidade, String uf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRua() {
        return rua;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "Cliente:" + nome + "\n";
        texto += "Data de Nascimento: " + dataNascimento + "\n";
        texto += "CPF: " + cpf + "\n";
        texto += "Rua:" + rua + "\n";
        texto += "Numero:" + numero + "\n";
        texto += "Bairro:" + bairro + "\n";
        texto += "Cidade:" + cidade + "\n";
        texto += "UF:" + uf + "\n";
        return texto;
    }
    
    
}
