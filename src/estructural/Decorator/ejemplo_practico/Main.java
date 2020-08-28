package estructural.Decorator.ejemplo_practico;

import estructural.Decorator.ejemplo_practico.patron.componente.MessageProcessable;
import estructural.Decorator.ejemplo_practico.patron.componente.impl.MessageProcessor;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.DecodeMessageDecorator;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.EmailSenderMessageDecorator;
import estructural.Decorator.ejemplo_practico.patron.decorador.impl.EncodeMessageDecorator;

public class Main {
    public static void main(String[] args) {


        MessageProcessable procesor = new MessageProcessor("Hola");
        procesor.process();

        System.out.println("---");

        MessageProcessable procesor2 = new EmailSenderMessageDecorator(new MessageProcessor("Hola"));
        procesor2.process();

        System.out.println("---");

        MessageProcessable procesor3 = new EmailSenderMessageDecorator(new EncodeMessageDecorator(new MessageProcessor("Hola")));
        procesor3.process();

        System.out.println("---");

        MessageProcessable procesor4 = new DecodeMessageDecorator(new EmailSenderMessageDecorator(new EncodeMessageDecorator(new MessageProcessor("Hola"))));
        procesor4.process();

    }
}
