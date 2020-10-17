package solucao;

class Endereco {
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco(String rua, String numero, String bairro, String cidade, String uf) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        String texto = "";
        texto += "Rua:" + rua + "\n";
        texto += "Numero:" + numero + "\n";
        texto += "Bairro:" + bairro + "\n";
        texto += "Cidade:" + cidade + "\n";
        texto += "UF:" + uf + "\n";
        return texto;
    }
    
    
}
