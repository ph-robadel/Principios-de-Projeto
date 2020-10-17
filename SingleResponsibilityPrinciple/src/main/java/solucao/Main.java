package solucao;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Aristides Inocêncio", "10", "Boa vista", "cidade", "uf");
        Cliente cliente = new Cliente("Pedro Henrique", LocalDate.now(), "123.456.789-12", endereco);
        System.out.println(cliente);
    }
}
