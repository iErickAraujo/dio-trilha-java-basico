public class Operadores {
        public static void main(String[] args) {
                // Concatenação string(texto)
                String nomeCompleto = "Linguagem" + "Java";
                System.out.println(nomeCompleto);

                // Concatenação numero + string(texto)
                String concatenacao = "?";

                concatenacao = 1 + 1 + 1 + "1";
                System.out.println("1 + 1 + 1 + \"1\" Resultado: " + concatenacao);

                concatenacao = 1 + "1" + 1 + 1;
                System.out.println("1 + \"1\" + 1 + 1 Resultado: " + concatenacao);

                concatenacao = 1 + "1" + 1 + 1 + "1";
                System.out.println("1 + \"1\" + 1 + 1 + \"1\" Resultado: " + concatenacao);

                concatenacao = "1" + 1 + 1 + 1;
                System.out.println("\"1\" + 1 + 1 + 1 Resultado: " + concatenacao);

                concatenacao = "1" + (1 + 1 + 1);
                System.out.println("\"1\" + (1 + 1 + 1) Resultado: " + concatenacao);

                // Numeros negativos e positivos
                int numero = 5;

                System.out.println("-numero Resultado: " + -numero);// -5

                System.out.println("numero Resultado: " + numero);// 5

                numero = -numero;
                System.out.println("numero = -numero Resultado: " + numero);// -5

                numero = numero * -1;
                System.out.println("numero = +numero Resultado: " + numero);// -5

                // x repetição
                int numeroRepeticao = 5;
                int numeroRepeticao2 = 5;
                int numeroRepeticao3 = 5;
                int numeroRepeticao4 = 5;

                // numeroRepeticao++;
                System.out.println(numeroRepeticao);
                System.out.println("numeroRepeticao++ Incrementa depois > Vai imprimir (5)   " + numeroRepeticao++);
                System.out.println("Incrementa depois > Vai imprimir (6)   " + numeroRepeticao);
                System.out.println("++numeroRepeticao Incrementa antes > Vai imprimir (6)   " + ++numeroRepeticao2);
                System.out.println("Incrementa antes > Vai imprimir (6)   " + numeroRepeticao2);

                System.out.println("numeroRepeticao-- Decrementa depois > Vai imprimir (5)   " + numeroRepeticao3--);
                System.out.println("Decrementa depois > Vai imprimir (4)   " + numeroRepeticao3);
                System.out.println("--numeroRepeticao Decrementa antes > Vai imprimir (4)   " + --numeroRepeticao4);
                System.out.println("Decrementa antes > Vai imprimir (4)   " + numeroRepeticao4);

                // Boolean
                boolean variavel = true;
                System.out.println("!variavel (false) Inverte o valor da variavel em memoria: " + !variavel);
                System.out.println("variavel (true) Inverte o valor da variavel em memoria: " + variavel);
                variavel = !variavel;
                System.out.println("variavel = !variavel (false) Inverte o valor da variavel fixo: " + variavel);

                // Operador ternario
                int a, b;
                a = 5;
                b = 6;
                String resultado = a == b ? "Verdadeiro" : "Falso";

                System.out
                                .println("Operador ternario         String resultado = a == b ? \"Verdadeiro\" : \"Falso\"; Resultado: "
                                                + resultado);
                System.out
                                .println("Operador ternario         int resultado = a == b ? 1 : 0; Resultado: "
                                                + resultado);

                // Operadores relacionais
                int numero1 = 1;
                int numero2 = 2;

                boolean simNao = numero1 == numero2;
                System.out.println("numero1 é igual a numero2: " + simNao);
                simNao = numero1 == numero2;
                System.out.println("numero1 é diferente de numero2: " + simNao);
                simNao = numero1 != numero2;
                System.out.println("numero1 é maior que numero2: " + simNao);
                simNao = numero1 > numero2;
                System.out.println("numero1 é menor que numero2: " + simNao);
                simNao = numero1 < numero2;
                System.out.println("numero1 é maior ou igual a numero2: " + simNao);
                simNao = numero1 >= numero2;
                System.out.println("numero1 é menor ou igual a numero2: " + simNao);
                simNao = numero1 <= numero2;

                if (numero1 < numero2) {
                        System.out.println("A nossa condição é verdadeira");
                } else {
                        System.out.println("A nossa condição é falsa");
                }

                String nome1 = "Erick";
                String nome2 = "Erick";// true
                // comparando com objeto
                // String nome2 = new String("Erick");//false

                System.out.println(nome1 == nome2);
                // comparando com objeto usando equals
                // System.out.println(nome1.equals(nome2));//true

                // Operadores logicos
                boolean condicao1 = true;
                boolean condicao2 = true;

                if (condicao1 && condicao2) {// true e true
                        System.out.println("As duas condições são verdadeiras.");
                }

                if (condicao1 && (7 > 4)) {// true e true
                        System.out.println("As duas condições são verdadeiras.");
                }

                if (condicao1 || condicao2) {// caso alguma for true
                        System.out.println("Uma das condições é verdadeiras.");
                }

                System.out.println("Fim");
        }
}
