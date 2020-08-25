package estructural.Decorator.ejemplo_teorico.patron.decorator;

import estructural.Decorator.ejemplo_teorico.patron.component.Enemy;

public abstract class EnemyDecorator implements Enemy {

    private Enemy enemy; // Decorated enemy

    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public int takeDamage() {
        return enemy.takeDamage();
    }
}
