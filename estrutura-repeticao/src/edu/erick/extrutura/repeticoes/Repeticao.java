package edu.erick.extrutura.repeticoes;

public class Repeticao {
    public static void main(String[] args) throws Exception {
        // Repetição
        // For
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos" + carneirinhos);
        }
        System.out.println("Joãozinho dormiu.");

        // For em Arrays(indice dos elementos se inicia em 0)
        String alunos[] = { "Erick", "Fernando", "Araújo", "Oliveira" };
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + "é" + alunos[x]);
        }

        // Foreach forma abreviada
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

        // Break//resultado: 1,2
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
            }

            System.out.println(numero);
        }

        // Continue//resultado: 1,2,3,4,5
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break;
            }

            System.out.println(numero);
        }

        // While
        int contador = 0;

        while (contador < 10) {
            System.out.println(contador);
            contador++;
        }

        // Do While
        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);
    }
}
