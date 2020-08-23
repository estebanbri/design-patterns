package comportamiento.Strategy.ejemplo_practico;

import comportamiento.Strategy.ejemplo_practico.context.AttackContext;
import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;
import comportamiento.Strategy.ejemplo_practico.strategy.impl.SwordAttackStrategy;
import comportamiento.Strategy.ejemplo_practico.strategy.impl.GunAttackStrategy;

public class Main {

    public static Integer HEALTH = 100;

    public static void main(String[] args) {

        IStrategy strategyA = new SwordAttackStrategy();
        IStrategy strategyB = new GunAttackStrategy();

        AttackContext context = new AttackContext(strategyA);

        context.attack();

        context.setStrategy(strategyB);

        context.attack();

    }
}
