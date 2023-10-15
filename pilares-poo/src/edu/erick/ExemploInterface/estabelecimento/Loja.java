package edu.erick.ExemploInterface.estabelecimento;

import javax.tools.Diagnostic;

import edu.erick.ExemploInterface.equipamentos.copiadora.Copiadora;
import edu.erick.ExemploInterface.equipamentos.digitalizadora.Digitalizadora;
import edu.erick.ExemploInterface.equipamentos.impressora.Deskjet;
import edu.erick.ExemploInterface.equipamentos.impressora.Impressora;
import edu.erick.ExemploInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        Impressora impressora0 = new Deskjet();
        impressora0.imprimir();

        // Impressora imp = new EquipamentoMultifuncional();
        // imp.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
