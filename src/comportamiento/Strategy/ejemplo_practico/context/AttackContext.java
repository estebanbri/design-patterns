package comportamiento.Strategy.ejemplo_practico.context;

import comportamiento.Strategy.ejemplo_practico.strategy.IStrategy;

public class AttackContext {

    private IStrategy strategy;

    public AttackContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        this.strategy.execute();
    }

    public void setStrategy(IStrategy strategy){
        this.strategy = strategy;
    }
}
