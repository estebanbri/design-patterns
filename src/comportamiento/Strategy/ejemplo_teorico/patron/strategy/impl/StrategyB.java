package comportamiento.Strategy.ejemplo_teorico.patron.strategy.impl;

import comportamiento.Strategy.ejemplo_teorico.patron.strategy.IStrategy;

public class StrategyB implements IStrategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
