package comportamiento.Strategy;

import comportamiento.Strategy.patron.context.Context;
import comportamiento.Strategy.patron.strategy.IStrategy;
import comportamiento.Strategy.patron.strategy.impl.StrategyA;
import comportamiento.Strategy.patron.strategy.impl.StrategyB;

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
