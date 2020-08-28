package estructural.Decorator.ejemplo_teorico.patron.decorator.impl;

import estructural.Decorator.ejemplo_teorico.patron.component.Component;
import estructural.Decorator.ejemplo_teorico.patron.decorator.Decorator;

public class ConcreteDecoratorA extends Decorator {

    private static final String propertyAdded1 = "[ ";
    private static final String propertyAdded2 = " ]";

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String operation(String msj) {
        return addedBehaviorToExistentMethod(super.operation(msj));
    }

    private String addedBehaviorToExistentMethod(String msj){
        return propertyAdded1 + msj + propertyAdded2;
    }

}
