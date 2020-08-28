package estructural.Decorator.ejemplo_practico.patron.componente.impl;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;

public class MessageProcessor implements MessageProcessable {

    private String message;

    public MessageProcessor(String message) {
        this.message = message;
    }

    @Override
    public String process() {
        System.out.println("Message: " + message);
        return message;
    }

}
