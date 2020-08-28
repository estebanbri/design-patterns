package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;
import estructural.Decorator.ejemplo_practico.patron.decorador.MessageDecorator;


public class EncodeMessageDecorator extends MessageDecorator {

    private static final int ATTACK_INCREASE = 33;

    public EncodeMessageDecorator(MessageProcessable messageProcessable) {
        super(messageProcessable);
    }

    @Override
    public String process() {
        return encode(super.process());
    }

    private String encode(String message) {
        String encodeMessage = new StringBuilder(message).reverse().toString();
        System.out.println("Encoded message..." + encodeMessage);
        return encodeMessage;
    }

}
