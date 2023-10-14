package edu.erick.pilaresPOO.heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        System.out.println("MSNMessenger\r\n\n");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FacebookMessenger\r\n\n");
        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        System.out.println("Telegram\r\n\n");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
