package edu.erick.parte2;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Erick";
        String segundoNome = "Fernando";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        String meuNome = "Erick";

        int anoFabricacao = 2022;

        boolean verdadeira = false;

        anoFabricacao = 2018;

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);
    }
}
