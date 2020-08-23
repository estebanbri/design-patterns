package comportamiento.Strategy.patron.strategy.impl;

import comportamiento.Strategy.patron.strategy.IStrategy;

public class StrategyA implements IStrategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
