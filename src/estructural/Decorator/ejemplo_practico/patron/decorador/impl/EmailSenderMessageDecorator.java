package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;
import estructural.Decorator.ejemplo_practico.patron.decorador.MessageDecorator;

public class EmailSenderMessageDecorator extends MessageDecorator {

    private static final int ATTACK_REDUCTION = 5;

    public EmailSenderMessageDecorator(MessageProcessable messageProcessable) {
        super(messageProcessable);
    }

    @Override
    public String process() {
        String message = super.process();
        sendEmail(message);
        return message;
    }

    private void sendEmail(String msj){
        System.out.println("Sending email, msj = " + msj);
    }

}
