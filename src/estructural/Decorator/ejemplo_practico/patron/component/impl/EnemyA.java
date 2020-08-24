package estructural.Decorator.ejemplo_practico.patron.component.impl;

import estructural.Decorator.ejemplo_practico.patron.component.Enemy;

public class EnemyA implements Enemy {

    @Override
    public int takeDamage() {
        return 10; // retorna 10 de daño
    }

}
