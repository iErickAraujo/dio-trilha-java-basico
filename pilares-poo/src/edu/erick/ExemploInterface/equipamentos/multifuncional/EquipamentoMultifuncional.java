package edu.erick.ExemploInterface.equipamentos.multifuncional;

import edu.erick.ExemploInterface.equipamentos.copiadora.Copiadora;
import edu.erick.ExemploInterface.equipamentos.digitalizadora.Digitalizadora;
import edu.erick.ExemploInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {

    public void digitalizar() {
        System.out.println("Digitalizando... Via equipamento multifuncional.");
    }

    public void imprimir() {
        System.out.println("Imprimindo... Via equipamento multifuncional.");
    }

    public void copiar() {
        System.out.println("Copiando... Via equipamento multifuncional.");
    }

}
