package edu.erick.pilaresPOO.overview;

public class Carro extends Veiculo{

    public void ligar() {
        conferirCambio();
        conferirCombustivel();
        System.out.println("Carro ligado.");
    }

    private void conferirCombustivel() {
        System.out.println("Conferindo Combustivel.");
    }

    private void conferirCambio() {
        System.out.println("Conferindo Cambio em P.");
    }
}
