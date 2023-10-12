public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        // estudem a classe String que representa textro na aplicação

        String meuNome = "Erick";

        double salarioMinimo = 2500;
        System.out.println("Salario Minimo: " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.println("Não recomendado: short numeroCurto=1;\r\n" + //
                "        int numeroNormal=numeroCurto;\r\n" + //
                "        short numeroCurto2=(short) numeroNormal;");

        final double VALOR_DE_PI = 3.14;
        System.out.println("Declaração de uma Constante : final double VALOR_DE_PI = 3.14;");
    }
}
