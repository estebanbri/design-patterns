package estructural.Decorator.ejemplo_teorico.patron.component.impl;

import estructural.Decorator.ejemplo_teorico.patron.component.Enemy;

public class EnemyA implements Enemy {

    @Override
    public int takeDamage() {
        return 10; // retorna 10 de daño
    }

}
