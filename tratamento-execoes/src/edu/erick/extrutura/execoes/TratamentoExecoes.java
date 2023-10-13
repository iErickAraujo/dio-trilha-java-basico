package edu.erick.extrutura.execoes;

public class TratamentoExecoes {
    public static void main(String[] args) throws Exception {
        // Tratamento de exeções
        // try catch
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir um número por zero.");
        }

        // try catch finaly
        try {
            int numero = Integer.parseInt("abc");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("O valor não é um número.");
        } finally {
            System.out.println("Este código sempre será executado.");
        }
    }
}
