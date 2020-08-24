package estructural.Decorator.ejemplo_practico.patron.decorator.impl;

import estructural.Decorator.ejemplo_practico.patron.component.Enemy;
import estructural.Decorator.ejemplo_practico.patron.decorator.EnemyDecorator;

public class EnemyDecoratorImpl extends EnemyDecorator {

    public EnemyDecoratorImpl(Enemy enemy) {
        super(enemy);
    }

    @Override
    public int takeDamage() {
        return super.takeDamage() / 2; // Daño reducido a la mitad
    }
}
