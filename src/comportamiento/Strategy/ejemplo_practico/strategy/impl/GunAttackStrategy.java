package comportamiento.Strategy.ejemplo_practico.strategy.impl;

import comportamiento.Strategy.ejemplo_practico.Main;
import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;

import static comportamiento.Strategy.ejemplo_practico.Main.HEALTH;

public class GunAttackStrategy implements IStrategy {

    private static final int gunDamage = 50;

    @Override
    public void execute() {
        HEALTH -= gunDamage;
        System.out.println("Making gun damage current health: " + HEALTH);
    }
}
