package edu.erick.extrutura;

public class Escopo {
    // Escopo de classe (variável de instância)
    int variavelDeInstancia;

    public void meuMetodo() {
        // Escopo de método
        int variavelLocal;

        if (true/* condicao */) {
            // Escopo de bloco
            int variavelBloco;

            // Pode acessar variavelLocal, variavelBloco e variavelDeInstancia aqui
        }

        // Pode acessar variavelLocal e variavelDeInstancia aqui
        // Não pode acessar variavelBloco aqui
    }

    public void meuOutroMetodo(int parametro) {
        // Escopo de parâmetro
        // Pode acessar parametro e variavelDeInstancia aqui
    }

    public static void main(String[] args) {
        // Aqui você pode criar instâncias da classe e acessar seus métodos e variáveis
        Escopo objeto = new Escopo();
        objeto.meuMetodo();
        objeto.meuOutroMetodo(42);

        // Não é possível acessar variavelLocal e variavelBloco aqui, pois estão no
        // escopo dos métodos
    }
}
