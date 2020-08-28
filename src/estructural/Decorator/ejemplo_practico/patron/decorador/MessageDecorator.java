package estructural.Decorator.ejemplo_practico.patron.decorador;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;

public abstract class MessageDecorator implements MessageProcessable {

    private MessageProcessable messageProcessable;

    public MessageDecorator(MessageProcessable messageProcessable) {
        this.messageProcessable = messageProcessable;
    }

    @Override
    public String process() {
        return messageProcessable.process();
    }
}
