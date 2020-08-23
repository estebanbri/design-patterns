package comportamiento.Strategy.ejemplo_teorico;

import comportamiento.Strategy.ejemplo_teorico.patron.context.Context;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.IStrategy;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.impl.StrategyA;
import comportamiento.Strategy.ejemplo_teorico.patron.strategy.impl.StrategyB;

public class Main {
    public static void main(String[] args) {
        IStrategy strategyA = new StrategyA();
        IStrategy strategyB = new StrategyB();

        Context context = new Context(strategyA);
        int result = context.execute();
        System.out.println(result);

        context.setStrategy(strategyB);
        result = context.execute();
        System.out.println(result);
    }
}
