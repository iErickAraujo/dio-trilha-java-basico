package edu.erick.extrutura.condicinal;

public class Condicionais {
    public static void main(String[] args) {
        // Condicionais
        double saldo = 25.0;
        double valorSolicitado = 17.0;
        // Simples
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }

        // Composta
        int nota = 7;
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        // Encadeada
        if (nota >= 7) {
            System.out.println("Aprovado!");
        }
        if (nota >= 5 && nota < 7) {
            System.out.println("Prova Recupreração!");
        } else {
            System.out.println("Reprovado!");
        }

        // Ternária
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        // Ternária Encandeada
        String resultado2 = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);

        // Switch Case
        String sigla = "M";

        if (sigla == "P") {
            System.out.println("Pequeno");
        } else if (sigla == "M") {
            System.out.println("Medio");
        } else if (sigla == "G") {
            System.out.println("Grande");
        } else {
            System.out.println("Indefinido");
        }

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;

            default:
                System.out.println("Indefinido");
                break;
        }

        String plano = "T";
        switch (plano) {
            case "T":
                System.out.println("5Gb Youtube");
                break;
            case "M":
                System.out.println("Whatsapp e Instagram grátis");
                break;
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Plano Invalido");
                break;
        }
    }
}
