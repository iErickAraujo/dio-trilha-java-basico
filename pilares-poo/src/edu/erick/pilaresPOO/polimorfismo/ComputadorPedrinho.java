package edu.erick.pilaresPOO.polimorfismo;

import edu.erick.pilaresPOO.polimorfismo.apps.FacebookMessenger;
import edu.erick.pilaresPOO.polimorfismo.apps.MSNMessenger;
import edu.erick.pilaresPOO.polimorfismo.apps.ServicoMensagemInstantanea;
import edu.erick.pilaresPOO.polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*
         * NÃO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "???";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}