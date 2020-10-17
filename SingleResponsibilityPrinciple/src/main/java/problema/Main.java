package problema;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pedro Henrique", LocalDate.now(), "123.456.789-12", "Aristides Inocêncio", "10", "Boa vista", "Vitório", "ES");
        System.out.println(cliente);
    }
}
