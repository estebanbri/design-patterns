package estructural.Decorator.ejemplo_teorico.patron.component.impl;

import estructural.Decorator.ejemplo_teorico.patron.component.Component;

public class ConcreteComponent implements Component {

    @Override
    public String operation(String msj) {
       return "{ " + msj + " }";
    }

}
