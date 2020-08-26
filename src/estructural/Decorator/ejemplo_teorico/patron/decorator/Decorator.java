package estructural.Decorator.ejemplo_teorico.patron.decorator;

import estructural.Decorator.ejemplo_teorico.patron.component.Component;

public abstract class Decorator implements Component {

    private Component decoratedComponent;

    public Decorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public String operation(String msj) {
        return decoratedComponent.operation(msj);
    }
}
