package estructural.Decorator.ejemplo_practico.patron.decorador.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;
import estructural.Decorator.ejemplo_practico.patron.decorador.MessageDecorator;

public class DecodeMessageDecorator extends MessageDecorator {

    public DecodeMessageDecorator(MessageProcessable messageProcessable) {
        super(messageProcessable);
    }

    @Override
    public String process() {
        return decode(super.process());
    }

    private String decode(String message) {
        String decodeMessage = new StringBuilder(message).reverse().toString();
        System.out.println("Decoded message..." + decodeMessage);
        return decodeMessage;
    }

}
