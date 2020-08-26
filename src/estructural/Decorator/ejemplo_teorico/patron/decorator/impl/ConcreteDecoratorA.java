package estructural.Decorator.ejemplo_teorico.patron.decorator.impl;

import estructural.Decorator.ejemplo_teorico.patron.component.Component;
import estructural.Decorator.ejemplo_teorico.patron.decorator.Decorator;

public class ConcreteDecoratorA extends Decorator {

    private String propertyAdded = ".-";

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String operation(String msj) {
        return addedBehaviorToExistentMethod(super.operation(msj));
    }

    // Si bien es un metodo public es decir rompes el contrato de
    // la interfaz o bien vas a tener que hacerle un UpCast a
    // la referencia en caso de usar el tipo Component o directamente
    // usar el tipo especifico del decorador para no tener que hacer el case
    // nota: esto es valido porque hasta el jdk en DataInputStream tiene metodos public que no
    // estan declarados en el contrato del cual hereda
    public String capitalizeMessage(String msj) {
        return msj.toUpperCase() + propertyAdded;
    }

    private String addedBehaviorToExistentMethod(String msj){
        return "[ " + msj + " ]";
    }


}
