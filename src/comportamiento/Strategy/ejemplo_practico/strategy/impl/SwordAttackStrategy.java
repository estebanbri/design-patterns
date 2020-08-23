package comportamiento.Strategy.ejemplo_practico.strategy.impl;

import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;

import static comportamiento.Strategy.ejemplo_practico.Main.HEALTH;

public class SwordAttackStrategy implements IStrategy {

    private static final int swordDamage = 20;

    @Override
    public void execute() {
        HEALTH -= swordDamage;
        System.out.println("Making sword damage current health: " + HEALTH);
    }
}
