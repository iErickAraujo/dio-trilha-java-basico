package edu.erick.ExemploInterface.equipamentos.digitalizadora;

public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("Scanner Digitalizando...");
    }

}
