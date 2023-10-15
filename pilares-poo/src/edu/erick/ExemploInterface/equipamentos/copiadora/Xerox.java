package edu.erick.ExemploInterface.equipamentos.copiadora;

public class Xerox implements Copiadora {

    @Override
    public void copiar() {
        System.out.println("Xerox Copiando...");
    }

}
